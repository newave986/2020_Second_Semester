"""
arxiv.org 논문 제목 스크래핑

# 검색어: Deep Learning
# 논문 발행 년도: Input으로 입력받기
# 스크래핑 할 논문 제목의 수: Input으로 입력받기
# 정렬: 인기순
"""

import requests
from bs4 import BeautifulSoup

def get_URL(page):
    
    url_before_year = "https://arxiv.org/search/advanced?advanced=&terms-0-term=deep+learning&terms-0-operator=AND&terms-0-field=all&classification-physics_archives=all&classification-include_cross_list=include&date-filter_by=specific_year&date-year="
    url_after_year = "&date-from_date=&date-to_date=&date-date_type=submitted_date&abstracts=show&size=50&order=&start="
    
    URL = url_before_year + str(year) + url_after_year + str(page)
    return URL

def getTitle(soup):
    global title
    title_links = soup.find_all(attrs = 'title is-5 mathjax')
    for title_link in title_links:
        title_txt = title_link.text
        title_txt = title_txt.replace('\n', '')
        title_txt = title_txt.replace('  ', '')
        title.append(title_txt)

print("your final page? >>", end = '')
last_page = int(input())
print("your year? >>", end = '')
year = int(input())

page = 0
title = []

while (page < last_page):
        url = get_URL(page * 50)
        
        text = requests.get(url)
        soup = BeautifulSoup(text.text, "html.parser")
        
        getTitle(soup)
        page += 1

print(title)