# -*- coding: utf-8 -*-
"""
Created on Tue May  4 19:17:48 2021

"""


"""
Lab 15
LSA(Latent Semantic Analysis) 이용하여 Topic Modelling 수행

Web and Text Mining, Prof. Lee
Review/Github Upload 용도로 code 일부 발췌, 수정하여 업로드
"""


"""
LSA(Latent Semantic Analysis)
가정: 가까운 단어가 유사한 텍스트 - 의미 발생

DTM(doc-word matrix) A 생성
A + Singular Value Decomposition (SVD)
--> 단어-문맥 간 내재적 의미(latent/hidden meaning) 효과적 보존 가능

"""


"""
sklearn의 Twenty News Groups 데이터 사용하여 실습
"""

import numpy as np
import warnings
warnings.filterwarnings('ignore')

import pandas as pd

from sklearn.datasets import fetch_20newsgroups
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.decomposition import TruncastedSVD

from nltk.corpus import stopwords

dataset = fetch_20newsgroups(shuffle=True, random_state=1, remove('headers', 'footers', 'quotes'))

documents = dataset.data

# 전처리 수행
news_df = pd.DataFrame({'document': documents})
# "document"가 하나의 column이 됨

news_df['clean_doc'] = news_df['document'].str.replace("[^a-zA-Z]", " ") 
# 특수 문자 제거
news_df['clean_doc'] = news_df['clean_doc'].apply(lambda x: ' '.join([w for w in x.split() if len(w)>3]))
# 공백 기준으로 문자열 나눔
# 길이 3 이하 단어 제거
news_df['clean_doc'] = news_df['clean_doc'].apply(lambda x: x.lower())
# 전체 단어 소문자로 변환
stop_words = stopwords.words('english')
tokenized_doc = news_df['clean_doc'].apply(lambda x: x.split()) 
tokenized_doc = tokenized_doc.apply(lambda x: [item for item in x if item not in stop_words])
# 불용어 제거

# Tf-IDF 행렬 제작
detokenized_doc = []

for index in range(len(news_df)):
    word = ' '.join(tokenized_doc[index])
    detokenized_doc.append(word)
    
news_df['clean_doc'] = dotokenized_doc

vectorizer = TfidfVectorizer(max_features= 1000, max_df = 0.6, min_df = 2)
X = vectorizer.fit_transform(news_df['clean_doc'])

# LSA Topic Modelling
svd_model = TruncatedSVD(n_components=20, n_iter=50, random_state=1)
svd_model.fit(X)

np.shape(svd_model.components_) 
# svd_model.components_: LSA에서 VT에 해당

terms = vectorizer.get_feature_names()
# 단어 집합 - 1000개 단어 저장
def get_topics(components, feature_names, n=5):
    for index, topic in enumerate(components):
        print("Topic %d:" % (index+1), [(feature_names[i], topic[i].round(5)) for i in topic.argsort()[:-n-1:-1]])       
# 각 Topic 당 1,000개의 열 중 가장 큰 값 5개를 찾아 단어로 출력함

get_topics(svd_model.components_, terms)


"""
Numpy의 linalg.svd() 쓴다면:
    lialg.svd는 특이값 분해의 결과로 대각 행렬이 아니라 특이값의 리스트를 반환
    s를 후에 사용자가 대각 행렬로 바꿔 줘야 함
"""