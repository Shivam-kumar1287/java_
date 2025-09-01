fruits=["mango","banana","apple"]
print(fruits)
print(type(fruits))
print(len(fruits))
print(fruits[0])
print(fruits[1])
print(fruits[2])
a=input("Enter fruit name:")
if a in fruits:
    print("Yes",a,"is present in the list")
else:
    print("No",a,"is not present in the list")
fruits.append("orange")