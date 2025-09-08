# Initialize two sets
a = {"one", "two", "three"}
b = {"three", "four", "five"}

# Basic set operations using operators
print(a | b)  # Union: All unique elements from both sets
print(a & b)  # Intersection: Elements common to both sets
print(a - b)  # Difference: Elements in a but not in b
print(a ^ b)  # Symmetric Difference: Elements in either set but not both

# Show that original set a is unchanged after operations
print(a)  # Original set a remains intact

# Set comparison methods
print("isdisjoint", a.isdisjoint(b))  # True if sets have no common elements
print("issubset", a.issubset(b))     # True if all elements of a are in b
print("issuperset", a.issuperset(b)) # True if a contains all elements of b

# Set operations using method syntax (equivalent to operators)
print("union", b.union(a))           # Returns union of sets (b | a)
print("intersection", a.intersection(b))  # Returns intersection (a & b)
print("difference", a.difference(b)) # Returns difference (a - b)

# Symmetric difference using method (returns new set)
print(a.symmetric_difference(b))  # Returns symmetric difference (a ^ b)

# Show that a is still unchanged (methods return new sets)
print(a)  # Original set a remains unchanged

# Update methods (modify the set in-place)
a.update(b)  # Adds all elements from b to a (modifies a)
print(a)  # Now a contains all elements from both sets