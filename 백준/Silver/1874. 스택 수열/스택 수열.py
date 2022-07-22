import sys

n = int(sys.stdin.readline())
dest = [ int(sys.stdin.readline()) for _ in range(n)]
src = [ i for i in range(n, 0, -1)]

tmp=[]
ans=[]

for d in dest:
    while src and src[-1]<=d:
        tmp.append(src.pop())
        ans.append('+')
    
    if tmp and tmp[-1] ==d:
        tmp.pop()
        ans.append('-')
    else:
        print('NO')
        break
else:
    for op in ans:
        print(op)