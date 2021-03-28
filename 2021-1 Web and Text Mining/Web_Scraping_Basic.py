# -*- coding: utf-8 -*-
"""
Created on Sun Mar 28 12:59:32 2021

@author: newave986.git
"""

# Web Scraping Basic


import numpy as np
import pandas as pd
import requests 

import warnings
warnings.filterwarnings('ignore')


# scrap 하고 싶은 url
url = 'https://search.naver.com/search.naver'

# url 주소에 데이터를 요청
res = requests.get(url)

# 상태 확인을 위해 status code 출력 
# 200이므로 정상
print("status code:", res.status_code)

# 인공지능 검색 결과를 scrap 하고 싶으므로
# params 설정

params = {
 "where": "nexearch",
 "sm": "top_hty",
 "fbm": "0",
 "ie": "utf8",
 "query": "파이"
}

res = requests.get(url, params=params)

# 인코딩 방식 확인
print("인코딩 방식: ", res.encoding)
# UTF-8이므로 사용자가 임의로 인코딩/디코딩할 필요 없음

# 수집한 데이터의 사이즈를 확인함
print("수집 데이터 사이즈: ", len(res.text))

# 수집한 데이터를 출력함
print("---------\n수집한 데이터 출력\n--------\n", res.text)




