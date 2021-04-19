# coding: utf-8

"""
Web and Text Mining 실습 과제 2

# GitHub 업로드용 - 과제 일부 발췌

"""

# ## I. 전자신문 인공지능 검색 결과

# In[2]:


# 필요한 라이브러리 import

import numpy as np
import pandas as pd
import requests 

import warnings
warnings.filterwarnings('ignore')


# In[3]:


url = 'https://search.etnews.com/etnews/search.php'

res = requests.get(url)


# In[4]:
    

# status_code 이용하여 에러 여부 확인

print(res.status_code)


# 응답 코드가 200이므로 정상!

# In[5]:


# params optim 작성

params = {
    "kwd": "인공지능",
}


# In[6]:


# 데이터 수집

res = requests.get(url, params=params)


# In[7]:


# 인코딩 방식 확인

res.encoding

# 이미 UTF-8으로 인코딩되어 있기 때문에 사용자가 따로 인코딩/디코딩 해 줄 필요 없음.

# In[8]:


# 수집된 데이터 사이즈

print(len(res.text))


# In[9]:


# 수집한 데이터 내용 확인

res.text


# ## II. 디지털 타임즈 사이트 인공지능 검색 결과

# In[10]:


import numpy as np
import pandas as pd
import requests 

import warnings
warnings.filterwarnings('ignore')


# 디지털 타임즈 사이트에서 "인공지능"을 검색한 결과의 url은 http://search2.dt.co.kr/search.jsp?txt=%EC%9D%B8%EA%B3%B5%EC%A7%80%EB%8A%A5
# 
# - 따라서, 기본 url은 http://search2.dt.co.kr/search.jsp 까지이고
# - ?text 이하 부분은 parameter이다.

# In[11]:


url = 'http://search2.dt.co.kr/search.jsp'

res = requests.get(url)


# In[12]:


print(res.status_code)


# In[13]:


params = {
    "txt": "인공지능"
}


# In[14]:


res = requests.get(url, params=params)


# In[15]:


res.encoding


# In[16]:


print(len(res.text))


# In[17]:


res.text

