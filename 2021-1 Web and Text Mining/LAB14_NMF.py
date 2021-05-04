# -*- coding: utf-8 -*-
"""
Created on Tue May  4 18:48:36 2021
"""


"""
Lab 14
NMF(Non-negative MAtrix Factorization) 이용하여 Topic Modelling 수행

Web and Text Mining, Prof. Lee
Review/Github Upload 용도로 code 일부 발췌, 수정하여 업로드
"""


"""
NMF: 행렬 분해 기반 토픽 모델링, 비음수 행렬 분석

    전체 원소가 양수인 행렬 V -> 음수를 포함하지 않는 행렬 W * H 곱으로 분해
    V == W * H
    
    가중치 행렬 W: 관계 나타냄
    특성 행렬 H: 단어들과 새로운 특성 간의 관계를 나타냄. 해당 특징이 어떤 단어들에 의해 반응하는지 알 수 있음.

음수가 아닌 특성을 가진 데이터에만 적용함
"""


import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from konlpy.tag import Okt

from sklearn.feature_extraction.text import CountVectorizer
from sklearn.feature_extraction.text import TfidfVectorizer

from sklearn.decomposition import NMF

import warnings
warnings.filterwarnings('ignore')


okt = Okt()

def tokenizer(text):
    nouns = okt.nouns(text)
    return [noun for noun in nouns if len(noun) > 1]

topnews = pd.read_csv("headline news.csv")


"""
문서-단어 행렬 생성: TFidf 사용

max_df: 문서 빈도 상한선 (max_df% 넘는 문서에 출현하는 단어는 고려하지 않음)
min_df: 문서 빈도 하한선 (min_df개 이상 문서에 출현하는 단어 고려)
max_features: 전체 문서에서 출현 빈도가 높은 max_features개 단어만 고려)
"""

vectorizer = TfidfVectorizer(tokenizer=tokenizer, max_df=0.90, min_df=2, maX_features=1000)# max_df: 문서 빈도 상한선
tfidf = vectorizer.fit_transform(topnews['text'])

"""
NMF 적용

H: 문서-토픽 행렬 만듦
    한 열에서, column의 가장 값이 큰 index가 그것의 topic이 됨
W: 토픽-단어 행렬 만듦
"""

nmf = NMF(n_components=6, random_state=1)
H = nmf.fit_transform(tfidf) # doc-topic matrix
W = nmf.components_ # topic-word matrix

H.round(2) # 소수 세 번째 자리에서 반올림 - 두 번째 자리까지 출력
W.round(2)

topnews['topic'] = H.argmax(axis=1)
# axis=1 즉 column에서 가장 큰 값의 인덱스를 반환해 줌(argmax의 역할)

for idx in range(6):
    topic_idx = topnews.index[topnews['topic'] == idx]
    print('주제가 ( {0} ) 인 문서의 갯수 = {1}' .format(idx, len(topic_idx))) 
    # topic이 idx인 doc에서 tfidf의 합계를 단어의 점수로 계산한다.
    # tfdif = (doc-word matrix)
    # axis=0을 통해 row의 위-아래 값 더함
    # d를 이용하여 {단어:점수} 형태의 사전 생
    word_score = tfidf.toarray()[topic_idx].sum(axis=0)
    d = dict(zip(vectorizer.get_feature_names(), word_score))