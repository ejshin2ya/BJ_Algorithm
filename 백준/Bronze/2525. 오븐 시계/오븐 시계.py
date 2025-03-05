a,b=map(int, input().split())
c=int(input())
a+=c//60
b+=c%60

if b>=60:
    a+=1
    b-=60
    print(a%24, b)
else:
    print(a%24, b)