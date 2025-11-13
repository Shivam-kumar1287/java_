from collections import deque

dq = deque()
n = 5

# Take input
for i in range(n):
    dq.append(int(input()))

# Add 0 to the left
dq.appendleft(0)

print(dq)
