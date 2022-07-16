import sys
n= int(sys.stdin.readline())

word =[sys.stdin.readline().strip() for _ in range(n)]

set_word=set(word)
word=list(set_word)
word.sort()
word.sort(key=len)

for i in word:
    print(i)