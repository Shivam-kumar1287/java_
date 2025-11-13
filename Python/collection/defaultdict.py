# a defauldict is a dictinoary subclass that calls a factory function to supply missing values
from collections import defaultdict
# Example 2: Default to list
student_grades = defaultdict(list)

student_grades['Alice'].append(85)
student_grades['Alice'].append(92)
student_grades['Bob'].append(78)

# No need to check if key exists first!
student_grades['Charlie'].append(88)

print(dict(student_grades))
# {'Alice': [85, 92], 'Bob': [78], 'Charlie': [88]}