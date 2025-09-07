import json

student_data = {
    "name": "Shivam",
    "age": 20,
    "city": "New Delhi"
}

# Convert to JSON string with formatting
json_string = json.dumps(student_data, indent=4, separators=(", ", ": "))
print("Formatted JSON string:")
print(json_string)
print(type(json_string))  # <class 'str'>

# Convert back to Python dictionary
python_dict = json.loads(json_string)
print("\nBack to Python dictionary:")
print(python_dict)
print(type(python_dict))  # <class 'dict'>