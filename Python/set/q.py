# Create a set (duplicates are automatically removed)
q = {1, 4, 2, 5, 3, 5}  # Becomes {1, 2, 3, 4, 5}
print("Original set:", q)  # Output order may vary

# Add an element to the set
q.add(6)
print("After adding 6:", q)

# Remove an element from the set
q.remove(3)  # Removes element 3
print("After removing 3:", q)

# Find minimum and maximum values using built-in functions
print("Minimum value:", min(q))  # Use min() function, not q.min()
print("Maximum value:", max(q))  # Use max() function, not q.max()
b={7,8,9,1,6}
print("comman elements are:",q.intersection(b))  # Elements common to both sets