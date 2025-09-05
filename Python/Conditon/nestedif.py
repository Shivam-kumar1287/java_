a = int(input("Enter a number: "))
if a == 1:
    print("one")
elif a == 2:
    print("two")
elif a == 3:
    print("three")
else:
    print("not one,two,three")
b = int(input("Enter a number: "))

result = {
    1: "one",
    2: "two",
    3: "three"
}.get(b, "not one,two,three")

print(result)

# match c
print("Match case")
c = int(input("Enter a number: "))
match c:
    case 1:
        print("one")
    case 2:
        print("two")
    case 3:
        print("three")
    case _:
        print("not one,two,three")
#switch case
print("Switch case")
switch ={
    1: "one",
    2: "two",
    3: "three"
}
print(switch.get(a,"not one,two,three"))