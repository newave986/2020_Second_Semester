# -*- coding: utf-8 -*-
"""
Created on Tue May  4 21:39:49 2021

"""


"""
Lab 15
LDA(Latent Dirichlet Allocation) 이용하여 Topic Modelling 수행

Web and Text Mining, Prof. Lee
Review/Github Upload 용도로 code 일부 발췌, 수정하여 업로드
"""


"""
LDA(Latent Dirichlet Allocation)
잠재 디리클레 할당
단어가 특정 토픽에 존재할 확률 + 문서에 특정 토픽이 존재할 확률 -> 토픽 추출

1) 토픽 개수 k -> LDA는 토픽이 전체 문서에 걸쳐 분포되어 있다고 가정
2) 모든 단어를 k개 중 하나의 토픽에 할당(랜덤)
    - 각 문서는 토픽을 가짐
    - 토픽은 단어 분포를 가짐
    - 랜덤 할당 -> 틀림
3) 어떤 문서의 단어 w -> P(topic | document), P(word | topic) 기준으로 토픽 재할당

"""

import pandas as pd
import urllib.request

import nltk
from nltk.stem import WordNetLemmatizer
from nltk.corpus import startwords

from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.decomposition import LatentDirichletAllocation

import warnings
warnings.filterwarnings('ignore')

urllib.request.urlretrieve("https://raw.githubusercontent.com/franciscadias/data/master/abcnews-date-text.csv", 
                           filename="abcnews-date-text.csv")

data = pd.read_csv('abcnews-date-text.csv', error_bad_lines=False)



# 데이터 전처리
text = data[['headline_text']]
text['headline_text'] = text.apply(lambda x: nltk.word_tokenize(x['headline_text']), axis=1)

# 불용어 제거
stop = stopwords.words('english')
text['headline_text'] = text['headline_text'].apply(lambda x: [word for word in x if word not in (stop)])

# 표제어 추출
text['headline_text'] = text['headline_text'].apply(lambda x: [WordNetLemmatizer().lemmatize(word, pos='v') for word in x])
# 3인칭 단수 표현 -> 1인칭
# 과거 동사 -> 현재형

tokenized_doc = text['headline_text'].apply(lambda x: [word for word in x if len(word) > 3])
# 길이 3 이하 제거


# 역토큰화 -> Tf-Idf
detokenized_doc = []

for i in range(len(text)):
    t = ' '.join(tokenized_doc[i])
    detokenized_doc.append(t)

text['headline_text'] = detokenized_doc
vectorizer = TfidfVectorizer(stop_words='english', max_features= 1000)
X = vectorizer.fit_transform(text['headline_text'])


# 토픽 모델링
lda_model = LatentDirichletAllocation(n_components=10,learning_method='online',random_state=1,max_iter=1)
lda_top=lda_model.fit_transform(X)

terms = vectorizer.get_feature_names()
# 1000개 단어 집합

def get_topics(components, feature_names, n=5):
    for index, topic in enumerate(components):
        print("Topic %d:" % (index+1), [(feature_names[i], topic[i].round(2)) for i in topic.argsort()[:-n-1:-1]])
        
get_topics(lda_model.components_, terms)