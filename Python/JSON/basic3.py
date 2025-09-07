student_data={
    "name": "Shivam",
    "subject":
        {"Math", "Science", "English", "History"}
    ,
    "age": 20,
    "city": "New Delhi",
     "address":{
            "street": "123 Main St",
            "zip": "110001"
        }
        
}
# Convert to JSON string with formatting
import json
json_string=json.dumps(student_data, indent=4  )
print("Formatted JSON string:")
print(json_string)
print(type(json_string))  # <class 'str'>