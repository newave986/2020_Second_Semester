# -*- coding: utf-8 -*-
"""
Created on Sat Apr 10 04:51:05 2021

@author: newave986.git
"""

import warnings
warnings.filterwarnings('ignore')


from konlpy.tag import Kkma
from konlpy.tag import Komoran
from konlpy.tag import Hannanum
from konlpy.tag import Okt

kkma = Kkma() 
komoran = Komoran() 
hannanum = Hannanum() 
okt = Okt() 

# tag set 확인
print("kokoma : %s\n" % kkma.tagset)
print("komoran : %s\n" % komoran.tagset)
print("hannanum : %s\n" % hannanum.tagset)
print("Okt : %s\n" % okt.tagset)

# 형태소 분석 성능 비교
text = "내가그린기린그림은네가그린기린그림이다"

print("kokoma : %s\n" % kkma.morphs(text))
print("komoran : %s\n" % komoran.morphs(text))
print("hannanum : %s\n" % hannanum.morphs(text))
print("Okt : %s\n" % okt.morphs(text))

# 각 분석기의 품사 태깅 차이 확인 
print("kokoma : %s\n" % kkma.pos(text))
print("komoran : %s\n" % komoran.pos(text))
print("hannanum : %s\n" % hannanum.pos(text))
print("Okt : %s\n" % okt.pos(text))






