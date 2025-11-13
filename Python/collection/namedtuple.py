from collections import namedtuple

Student = namedtuple('Student', ['name', 'age', 'DOB'])
s = Student('Nandini', '23', '12343')

# Access by index (like regular tuple)
print("By index:")
print(s[0])    # 'Nandini'
print(s[1])    # '23'
print(s[2])    # '12343'

# Access by field name (more readable)
print("\nBy field name:")
print(s.name)  # 'Nandini'
print(s.age)   # '23'
print(s.DOB)   # '12343'

# Using getattr
print("\nUsing getattr:")
print(getattr(s, 'name'))  # 'Nandini'


#using _asdict()
# print(Student_asdict())