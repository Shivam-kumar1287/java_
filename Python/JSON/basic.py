#import libaray of json 
import json
data='{"name":"Shivam","age":20,"city":"New Delhi"}'
print(type(data))
print(data)
parsed=json.loads(data)
print(parsed["age"])

#convert python to json
json_string=json.dumps(parsed)
print(json_string)

#write json to file
with open("data.json","w") as file:
    json.dump(parsed,file)
    file.write(json_string)
print("Data written to file")
    
# JSON to Python type mapping
"""
JSON        Python
------      ------
object      dict
array       list
string      str
number      int/float
true        True
false       False
null        None

json.dumps() - Convert Python object to JSON string

json.dump() - Write Python object to JSON file

json.loads() - Convert JSON string to Python object

json.load() - Read JSON file to Python object"""