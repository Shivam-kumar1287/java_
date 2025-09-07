# Create an empty dictionary
a = {}

# Populate dictionary with numbers 1-10 as keys and their squares as values
for i in range(1, 11):
    a[i] = i**2

# Print the dictionary (with space instead of newline at the end)
print(a, end=" ")

# CORRECTED: Dictionary keys must be strings (in quotes)
b = {'w': 2, 'x': 3, 'y': 4, 'z': 5, 'd': 2, 's': 9, 'f': 0}

# Print the dictionary
print(b)

# Print all keys
print(b.keys())

# Print all values
print(b.values())

# Print all key-value pairs as tuples
print(b.items())

# Sort the values and assign to b (converts b from dict to list)
b = sorted(b.values())
print(b)