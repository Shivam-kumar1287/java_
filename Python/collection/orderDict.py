from collections import OrderedDict
# od=OrderedDict()
# od=['apple']=3
# od=['honey']=5
# print(od)

print("this is a Dict:\n")
d={}
d['a']=1
d['b']=2
d['c']=3
for key ,value in d.items():
    print(key,value)
print("\n this is an ordered Dict:\n")

od=OrderedDict()
od['a']=2
od['v']=3
od['f']=3
for key ,value in od.items():
    print(key,value)

#delete in OrderDict
od.pop('a')
print("Afete dlete a from OrderDict")
for key,value in od.items():
    print(key,value)