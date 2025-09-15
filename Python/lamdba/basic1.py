def myfunc(a,b):
    return (lambda a,b:a*b)(a,b)
a=int(input("enter a \n"))
b=int(input("enter b \n"))
print(myfunc(a,b))
def myfunc1(a,b):
    return (lambda a,b:a+b)(a,b)
print(myfunc1(a,b))