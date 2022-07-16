from array import array
import sys
x, y, w, h = map(int, sys.stdin.readline().split())

answer=min(w-x, h-y, x, y)
print(answer)