print("wtite a program to check if a number is positive")
n=int(input("enter a number"))
if n>0:
    print("positive number")
else:
    print("negative number")
print("EVEN ODD")
if n%2==0:
    print("even number")
else:
    print("odd number")
print("write a program to create area calculator")
r=int(input("enter the radius of circle"))
pi=3.14
area=pi*r*r
a1 = input("enter a string: ")

if len(a1) == 1:
    if a1.lower() in 'aeiou':
        print("vowel")
    else:
        print("consonant")
else:
    print("Please enter only a single character")