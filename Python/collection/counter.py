from collections import Counter, deque

text = "apple orange banana "
cout = Counter(text)
print(cout)

dq = deque()
print("enter a range of dqueue")
n = int(input())

for i in range(n):
    dq.append(int(input()))

print(dq)

print("enter search num")
n1 = int(input())

# Count all elements inside deque
dq_count = Counter(dq)

# Print count of searched number
print("Count:", dq_count[n1])
