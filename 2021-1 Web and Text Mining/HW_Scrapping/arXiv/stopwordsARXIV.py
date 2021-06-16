# -*- coding: utf-8 -*-
"""
arxiv.org 논문 제목 스크래핑 후 NLTK 다듬기

# 검색어: Deep Learning
# 논문 발행 년도: (예시) 2020
# 스크래핑 할 논문 제목의 수: (예시) 100개
# 정렬: 인기순
"""

import requests
from bs4 import BeautifulSoup

import nltk
from nltk.tokenize import word_tokenize
from nltk.tag import pos_tag

def get_URL(page):
    
    url_before_year = "https://arxiv.org/search/advanced?advanced=&terms-0-term=deep+learning&terms-0-operator=AND&terms-0-field=all&classification-physics_archives=all&classification-include_cross_list=include&date-filter_by=specific_year&date-year="
    url_after_year = "&date-from_date=&date-to_date=&date-date_type=submitted_date&abstracts=show&size=50&order=&start="
    
    URL = url_before_year + "2020" + url_after_year + str(page)
    return URL

def getTitle(soup):
    global title
    title_links = soup.find_all(attrs = 'title is-5 mathjax')
    for title_link in title_links:
        title_txt = title_link.text
        title_txt = title_txt.replace('\n', '')
        title_txt = title_txt.replace('  ', '')
        title.append(title_txt)
        
        
def wordTag(title):
    sentences_tag = []
    for sentence in title:
        word_tag = pos_tag(word_tokenize(sentence))
        sentences_tag.append(word_tag)
    return sentences_tag
    

def nounList(sentences_tag):
    
    noun_list = []
    
    for sentence in sentences_tag:
        for word, tag in sentence:
            if word not in stop_words:
                if tag in ['NNP'] or ['JJ']: 
                    noun_list.append(word)
    return noun_list


last_page = 2
page = 0
title = []

while (page < last_page):
        url = get_URL(page * 50)
        
        text = requests.get(url)
        soup = BeautifulSoup(text.text, "html.parser")
        
        getTitle(soup)
        page += 1

stop_words = set(["for", ":", "of", "and", "A", "in", "with", "on", "a", "to", "An", "the", "from", "the", "by"])

for title_list in title:
        title_list = title_list.replace("[^a-zA-Z]", " ")
        
        

sentences_tag = wordTag(title)
noun_list = nounList(sentences_tag)


from collections import Counter
from wordcloud import WordCloud

import matplotlib.pyplot as plt


counts = Counter(noun_list)
words = counts.most_common(100)
wordcloud = WordCloud(background_color="white", random_state=2)
print(dict(words))
cloud = wordcloud.generate_from_frequencies(dict(words))
plt.figure(figsize=(10, 8))
plt.axis('off')
plt.imshow(cloud)
plt.show()