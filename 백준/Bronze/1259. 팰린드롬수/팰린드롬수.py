import sys;

while True:
    text=sys.stdin.readline().strip()
    if text=='0':
        break
    if text == text[::-1]:
        print('yes')
    else:
        print('no')
    