import sys

n= int(sys.stdin.readline().strip())
cnt = 0
sixN =666
while True:
    if '666' in str(sixN):
        cnt+=1
    if n == cnt:
        print(sixN)
        break
    sixN+=1

