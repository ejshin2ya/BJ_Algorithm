n = int(input())
data = list(map(int, input().split()))
target = int(input())

start = 1
end = max(data)

while start <= end:
    mid = (start + end) // 2
    total = sum([mid if x > mid else x for x in data])

    if total <= target:
        start = mid + 1
    else:
        end = mid - 1

print(end)
