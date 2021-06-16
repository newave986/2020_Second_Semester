# -*- coding: utf-8 -*-
"""
RISS 논문 제목 스크래핑

# 검색어: Deep Learning
# 논문 발행 년도: Input으로 입력받기
# 스크래핑 할 논문 제목의 수: Input으로 입력받기
# 정렬: 인기순
"""

import requests
from bs4 import BeautifulSoup

def get_URL(page):
    url_before_page = "http://www.riss.kr/search/Search.do?isDetailSearch=N&searchGubun=true&viewYn=OP&queryText=&strQuery=%EB%94%A5%EB%9F%AC%EB%8B%9D&exQuery=pyear%3A"
    url_year_1 = "%E2%97%88&exQueryText=%EB%B0%9C%ED%96%89%EC%97%B0%EB%8F%84+%5B2021%5D%40%40pyear%3A"
    url_year_2 = "%E2%97%88&order=%2FDESC&onHanja=false&strSort=VIEWCOUNT&p_year1=&p_year2=&iStartCount="
    url_after_page = "&orderBy=&mat_type=&mat_subtype=&fulltext_kind=&t_gubun=&learning_type=&ccl_code=&inside_outside=&fric_yn=&image_yn=&gubun=&kdc=&ttsUseYn=&fsearchMethod=search&sflag=1&isFDetailSearch=N&pageNumber=&resultKeyword=&fsearchSort=&fsearchOrder=&limiterList=&limiterListText=&facetList=&facetListText=&fsearchDB=&icate=re_a_kor&colName=re_a_kor&pageScale=10&isTab=Y&regnm=&dorg_storage=&language=&language_code=&clickKeyword=&relationKeyword=&query=%EB%94%A5%EB%9F%AC%EB%8B%9D"
    
    URL = url_before_page + str(year) + url_year_1 + str(year) + url_year_2 + str(page) + url_after_page
    return URL

def getTitle(soup):
    global title
    title_links = soup.select('p.title > a')
    for title_link in title_links:
        title.append(title_link.text)

print("your final page? >>", end = '')
last_page = int(input())
print("your year? >>", end = '')
year = int(input())

page = 0
title = []

while (page < last_page):
        url = get_URL(page * 10)
        
        text = requests.get(url)
        soup = BeautifulSoup(text.text, "html.parser")
        
        getTitle(soup)
        page += 1
    
print(title)