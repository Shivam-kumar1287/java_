student={"name": "Shivam", "age": 20, "city": "New Delhi", "address": "asdasd"}
for i in student:
    print(i, ":", student[i])
print(student.keys())
print(student.values())
print(student.items())

#setdefault
student.setdefault("name","Shivam")
print(student)
student.setdefault("address","New Delhi")
print(student)