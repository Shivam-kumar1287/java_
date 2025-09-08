a = {"ironman", "captainamerica", "thor", "hulk"}
b = {"hulk", "blackwidow", "hawkeye"}

print(a | b)  # union - all elements from both sets
print(a & b)  # intersection - elements common to both sets
print(a - b)  # difference - elements in a but not in b
print(a ^ b)  # symmetric difference - elements in either set but not both
print(a)      # original set a (unchanged)
print(b.intersection_update(a))  # modifies b and returns None
print(b)      # b after intersection_update
a.symmetric_difference_update(b)  # modifies a
print(a)      # a after symmetric_difference_update
a.symmetric_difference(b)  # returns result but doesn't modify a
print(a)      # a remains unchanged from previous operation