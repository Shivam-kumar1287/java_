#create 
student={
    "name": "Shivam",
    "age": 20,
    "city": "New Delhi",
    "address": "asdasd"
    }
print(student)
print(type(student))  # <class 'dict'>
print(student["name"])  # Access value by key
print(student.get("age"))  # Access value by key using get method
print(student.keys())  # Get all keys
print(student.values())  # Get all values
print(student.items())  # Get all key-value pairs
# Modify value
student["age"] = 21
print(student)
# Add new key-value pair
student["email"] = "SA@DSFd"
print(student)
# Remove key-value pair
del student["city"]
print(student)
student.pop("address")
print(student)