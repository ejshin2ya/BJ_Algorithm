import sys

k, n = map(int, sys.stdin.readline().split())
lan = [ int(sys.stdin.readline()) for _ in range(k)]
start, end = 1, max(lan) # 이분탐색 처음과 끝위치

while start <=end:
    mid = (start + end) //2 #중간위치
    lines=0 #랜선 수
    for i in lan:
        lines+=i //mid # 분할 된 랜선 수 

    if lines >= n:
        start = mid+1
    else:
        end = mid -1
print(end)