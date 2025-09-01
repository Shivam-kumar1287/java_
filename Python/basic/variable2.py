print("Global and Local Variable")

x="hello "
def func():
    print(x)
func()
print(x)
def func1():
    y="hi"
    print(y)
func1()
print(y)