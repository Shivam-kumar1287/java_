a={"rama","krishna","shiva","govind"}
for i in a:
    print(i)
print(a)
a.add("vishnu")
print(a) 


a.remove("shiva")
print("removed element is:",a)
a.discard("govind")
print("discarded element is:",a)
a.pop()
print("popped element is:",a)
a.clear()
print("cleared set is:",a)   