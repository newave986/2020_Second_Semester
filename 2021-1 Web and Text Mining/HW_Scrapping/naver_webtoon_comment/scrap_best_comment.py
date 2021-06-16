# coding: utf-8

# # test/train set 만들기
# ### 웹툰 베스트 댓글 스크래핑
# 
# 한 웹툰을 정하여 그 웹툰의 회차별 **베스트 댓글**을 가져와 dataframe으로 정리한 코드입니다.
# 
# ```best_df``` dataframe:
# 
# |웹툰 제목|회차|내용|
# |---|---|---|
# |하루만 네가 되고 싶어|4화|예시입니다.|
# 
# ```selenium```을 이용하였습니다.

from selenium import webdriver 
from selenium.webdriver.chrome.options import Options

import time
import pandas as pd

options = webdriver.ChromeOptions()
options.add_experimental_option('excludeSwitches', ['enable-logging'])

driver = webdriver.Chrome('./chromedriver.exe', options=options)


def get_url(title, chap):
    url = "https://comic.naver.com/webtoon/detail.nhn?titleId={0}&no={1}".format(title, chap)
    return url


def get_best_comment(title, chapter):
    
    global best_df
    
    driver.find_element_by_partial_link_text('BEST댓글').click()

    page = 1
    scrap_on = 1
    
    while scrap_on:
        try: 
            for num in range(15):
                
                time.sleep(2)

                comment = driver.find_elements_by_class_name('u_cbox_contents')
            
                for count in range(15):
                    comment_info = [title, chapter, comment[count].text]
                    best_df = best_df.append(pd.Series(comment_info), ignore_index=True)                
                driver.find_element_by_xpath(f'//*[@id="cbox_module"]/div/div[7]/div/a[{num}]').click()

        except:
            scrap_on = 0


last = 74
best_df = pd.DataFrame(columns=[])


for i in range(1, last + 1):
    
    url = get_url(738487, i)

    driver.get(url)

    src = driver.find_element_by_id('commentIframe').get_attribute('src')
    driver.get(src)

    driver.find_element_by_xpath('//*[@id="cbox_module_wai_u_cbox_sort_option_tab2"]/span[2]').click()
    driver.find_element_by_xpath('//*[@id="cbox_module"]/div/div[5]/a').click()
    driver.find_element_by_xpath('//*[@id="cleanbot_dialog_checkbox_cbox_module"]').click()
    driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/div[4]/a').click()
    
    get_best_comment("하루만 네가 되고 싶어", str(i) + "화")


best_df.to_csv('./train_set.csv', index=False, encoding='utf-8-sig')

# - 일반 댓글 불러오는 것에서 베스트 댓글 불러오는 것으로 코드 변경
# - dataframe에 저장하는 형식 변경 (id, nickname 제거 + title, chapter 포함)
