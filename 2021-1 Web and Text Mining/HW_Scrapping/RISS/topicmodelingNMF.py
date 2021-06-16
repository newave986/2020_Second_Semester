# -*- coding: utf-8 -*-
"""
NMF 이용한 연도별 주제 추출
"""

def mostPickExept(noun_list):
    stopwords = set(['딥', '러닝', '기반', '이용', '연구'])
    noun = []
    
    for n in noun_list:
        if n not in stopwords:
            noun.append(n)
    
    counts = Counter(noun)
    words = counts.most_common(100)
    return words

years = [2021, 2020, 2019, 2018, 2017, 2016]

for year in years:
    
    title = []
    page = 0
    
    while (page < last_page):
        
        url = get_URL(page * 10)
        
        text = requests.get(url)
        soup = BeautifulSoup(text.text, "html.parser")
        
        getTitle(soup)
        page += 1
        
    sentences_tag = tagging(title)
    noun_list = pickNoun(sentences_tag)
    words = mostPickExept(noun_list)
    
    nmf = NMF(n_components=3, random_state=1)
    tfidf = vectorizer.fit_transform(noun_list)
    H = nmf.fit_transform(tfidf)
    W = nmf.components_
    H.round(2)
    W.round(2)
    
    wordcloud = WordCloud(font_path='C:/Windows/Fonts/malgun.ttf',
                      colormap = 'Accent_r',
                      width=500,
                      height=500,
                      max_words=50,
                      random_state=1,
                      background_color = "white")
    
    data = {'title': noun_list,
           'topic': H.argmax(axis=1)}
    df = pd.DataFrame(data, columns = ['title', 'topic'])

    plt.figure(figsize=(16, 8))

    print("***************************")
    print(str(year) + " 년도의 주제별 워드 클라우드")
    print("***************************")
    
    for idx in range(3):    
        topic_idx = df.index[df['topic'] == idx]

        print('주제가 ( {0} ) 인 문서의 갯수 = {1}' .format(idx, len(topic_idx))) 
        
        word_score = tfidf.toarray()[topic_idx].sum(axis=0)  

        d = dict(zip(vectorizer.get_feature_names(), word_score))
        wordcloud.generate_from_frequencies(d)

        plt.subplot(2,4,idx+1)
        plt.imshow(wordcloud)
        plt.axis("off")

    plt.subplots_adjust(wspace=0.3, hspace=0.3)
    plt.show()