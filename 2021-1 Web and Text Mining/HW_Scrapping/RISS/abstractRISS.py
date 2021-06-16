# -*- coding: utf-8 -*-
"""
RISS 논문 설명 스크래핑

# 검색어: Deep Learning
# 논문 발행 년도: 2021-2021
# 정렬: 인기순
"""

import requests
from bs4 import BeautifulSoup

def get_URL(page):
    url_before_page = "http://www.riss.kr/search/Search.do?isDetailSearch=N&searchGubun=true&viewYn=OP&queryText=&strQuery=%EB%94%A5%EB%9F%AC%EB%8B%9D&exQuery=&exQueryText=&order=%2FDESC&onHanja=false&strSort=RANK&p_year1=&p_year2=&iStartCount="
    url_after_page = "&orderBy=&mat_type=&mat_subtype=&fulltext_kind=&t_gubun=&learning_type=&ccl_code=&inside_outside=&fric_yn=&image_yn=&gubun=&kdc=&ttsUseYn=&fsearchMethod=search&sflag=1&isFDetailSearch=N&pageNumber=&resultKeyword=&fsearchSort=&fsearchOrder=&limiterList=&limiterListText=&facetList=&facetListText=&fsearchDB=&icate=re_a_kor&colName=re_a_kor&pageScale=10&isTab=Y&regnm=&dorg_storage=&language=&language_code=&clickKeyword=&relationKeyword=&query=%EB%94%A5%EB%9F%AC%EB%8B%9D"
    
    URL = url_before_page + str(page) + url_after_page
    return URL

def getTitle(soup):
    global title
    abstract_links = soup.find_all(attrs='preAbstract')
    for abstract_link in abstract_links:
        abstract.append(abstract_link.text)

print("your final page? >>", end = '')
last_page = int(input())

page = 0
abstract = []

while (page < last_page):
        url = get_URL(page * 10)
        
        text = requests.get(url)
        soup = BeautifulSoup(text.text, "html.parser")
        
        getTitle(soup)
        page += 1
    
print(abstract)