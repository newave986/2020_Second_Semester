import warnings
warnings.filterwarnings('ignore')

import nltk
nltk.download('book', quiet=True)

from nltk.book import *

nltk.download('stopwords', quiet=True)
nltk.corpus.gutenberg.fileids()
hamlet_raw = nltk.corpus.gutenberg.raw('shakespeare-hamlet.txt')

print(len(hamlet_raw))
print(hamlet_raw[:100])
print(hamlet_raw[:1302])





# 토큰 생성 메소드

# sentence 토큰화
from nltk.tokenize import sent_tokenize
len(sent_tokenize(hamlet_raw[:])
sent_tokenize(hamlet_raw[:])[2]

# word 토큰화
from nltk.tokenize import word_tokenize
word_tokenize(hamlet_raw[50:100])

# 정규식 사용
from nltk.tokenize import RegexpTokenizer
word_bot = RegexpTokenizer(r'[\w]+') # 단어만 추출
word_bot.tokenize(hamlet_raw[50:100])

# nltk 아닌 python 제공 method로 정규식 사용하기
import re
word_tok = re.compile(r'[\w]+')
print(word_tok.findall(hamlet_raw[50:100]))






# 형태소 분석


# 어간 추출 stemming
from nltk.stem import PorterStemmer, LancasterStemmer

st1 = PorterStemmer()
st2 =  LancasterStemmer()
words_list1 = ['fly', 'flies', 'flying', 'flew', 'flown'] 
print('Porter Stemmer   :', [st1.stem(wd) for wd in words_list1])
print('Lancaster Stemmer:', [st2.stem(wd) for wd in words_list1])


# 표제어 추출 lemmatizing
from nltk.stem import WordNetLemmatizer
wnlm = WordNetLemmatizer()
[wnlm.lemmatize(wd, pos="v") for wd in words_list1]


# 품사 부착 Part of Speech Tagging
from nltk.tag import pos_tag
sentence = "I am studying NLP with Hamlet"
tagged_list = pos_tag(word_tokenize(sentence))
nouns_list = [tag[0] for tag in tagged_list if tag[1] == "NN"]

from nltk.tag import untag
untag(tagged_list)
# untag로 태그 튜플 제거







# stopwords: 불용어 삭제 가능

from nltk.corpus import stopwords
example_token = ['i', 'am', 'going', 'to', 'go', 'to', 'the', 'store', 'and', 'park', 'by', 'my', 'car'] 
stop_words = stopwords.words('english')
word_list2 = [word for word in example_token if word not in stop_words]






# NLTK의 Text 클래스: 문서 분석에 유용한 여러가지 메소드를 제공
# 문자열 입력받아 토큰열 생성

from nltk import Text
word_bot = RegexpTokenizer(r'[\w]+') 
text = Text(word_bot.tokenize(hamlet_raw))
type(text)







# FreqDist 클래스: 문서에 사용된 단어(토큰)의 사용 빈도를 담는 클래스
from nltk import FreqDist
stopwords = ["Mr.", "Mrs.", "Miss", "Mr", "Mrs", "Dear", "VOLUME", "Between", "Sixteen"]
hamlet_tokens = post_tag(word_bot.tokenize(hamlet_raw))

names_list = names_list = [tok[0] for tok in hamlet_tokens if tok[1] == "NNP" and tok[0] not in stopwords]

fd_names = FreqDist(names_list)
# FreqDist Class는 단어를 key, 출현 빈도를 value를 가지는 dict 자료형과 유사함.

fd_names.N(), fd_names["Hamlet"], fd_names.freq("Hamlet")

fd_names.most_common(10)






# wordcloutd 패키지로 워드클라우드 그림

from wordcloud import 
wordcloud = WordCloud(background_color="white", random_state=0)
cloud= wordcloud.generate_from_frequencies(fd_names)
wordcloud.to_image()


# matplotlib 패키지로 워드 클라우드 그림
import matplotlib.pyplot as plt
plt.figure(figsize=(14,12)) # 가상의 도화지 크기 세팅
plt.imshow(cloud) # cloud 그림 그림
plt.axis("off") # x, y축 선 그리지 않음
plt.show()