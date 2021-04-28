# coding: utf-8

# # Web and Text Mining 실습 과제 3
# GitHub 업로드용 - 과제 일부 발췌

# > 네이버 뉴스 사이트에서 특정 키워드로 검색하는 프로그램을 작성한다.

# ## Contents
# - 1. 필요한 파라미터 입력받기
#     - (1) 특정 검색어 입력받기
#     - (2) 마지막 페이지 입력받기     
# - 2. 입력된 페이지 수만큼 기사 헤드라인 검색/수집
# - 3. 수집한 단어 출현 빈도 파악
# - 4. 출현 빈도에 근거하여 키워드 word cloud 그리기

import numpy as np
import pandas as pd

from bs4 import BeautifulSoup as bs 
import requests

import warnings
warnings.filterwarnings('ignore')


# ### 1-(1) 특정 검색어 입력받기

base_url ='https://search.naver.com/search.naver?where=news&sm=tab_jum&query='
keyword = input('검색어를 입력하세요 : ')

url= base_url + keyword


# ### 1-(2) 마지막 페이지 입력받기

end_page = input('마지막 페이지를 입력하세요 : ')


# ### 2. 입력된 페이지 수만큼 헤드라인 검색 및 수집하기

title_list = []

def scraping(key, end, start = 1):
    while True:
        if start > int(end) * 10 :
            break
            
        url = 'https://search.naver.com/search.naver?where=news&sm=tab_pge&query={}&start={}'.format(keyword, start)

        req = requests.get(url)
        page = bs(req.text, 'html.parser')
        titles = page.find_all(attrs='news_tit')

        for one in titles:
            title_list.append(one.text)
            
        start += 10


# 앞에서 입력받은 keyword, end_page를 가지고 scraping 함수를 호출
scraping(keyword, end_page)


# ### 3. 수집한 단어 출현 빈도 파악 - 단어 분석하기

from konlpy.tag import Okt
from konlpy.tag import Kkma
from konlpy.tag import Komoran
from konlpy.tag import Hannanum

from collections import Counter
from wordcloud import WordCloud
import matplotlib.pyplot as plt

kkma = Kkma()

sentences_tag = []

for sentence in title_list:
    word_tag = kkma.pos(sentence)
    sentences_tag.append(word_tag)

noun_list = []

for sentence in sentences_tag:
    for word, tag in sentence:
        if tag in ['NNG']: 
            noun_list.append(word)
            
noun_list = [word for word in noun_list  if len(word) > 1] # 두 음절 이상 명사만 추출

counts = Counter(noun_list)

words = counts.most_common(50)


# ### 4. 출현 빈도에 근거하여 키워드 word cloud 그리기

wordcloud = WordCloud(font_path='C:/Windows/Fonts/H2MJRE.ttf',
                      background_color='white',
                      colormap = 'Accent_r',
                      width=800,
                      height=600)

cloud = wordcloud.generate_from_frequencies(dict(words))

plt.figure(figsize=(10, 8))

plt.axis('off')   

plt.imshow(cloud)

plt.show()