from collections import ChainMap
d1={'a',1,'e',3,'d',5}
d2={'a',3,'f',4}
c=ChainMap(d1,d2)
print(c)
print(c['a'])
