b = "jsdkfh hello shiva "
print("String Slicing Methods in Python\n")

# String Slicing Syntax: string[start:stop:step]
# start - starting index (inclusive), default: 0
# stop - ending index (exclusive), default: end of string
# step - step size, default: 1

print("Original string:", repr(b))
print("Length of string:", len(b))
print()

# 1. Basic Slicing
print("1. Basic Slicing:")
print("b[0:5]   - from index 0 to 4:", repr(b[0:5]))          # "jsdkf"
print("b[:5]    - start to index 4:", repr(b[:5]))           # "jsdkf"
print("b[6:]    - index 6 to end:", repr(b[6:]))            # "hello shiva "
print("b[6:11]  - index 6 to 10:", repr(b[6:11]))          # "hello"
print()

# 2. Negative Index Slicing (counting from end)
print("2. Negative Index Slicing:")
print("b[-5:]   - last 5 characters:", repr(b[-5:]))         # "iva "
print("b[:-5]   - all but last 5:", repr(b[:-5]))           # "jsdkfh hello sh"
print("b[-10:-5] - from 10th last to 6th last:", repr(b[-10:-5])) # "lo sh"
print()

# 3. Step-based Slicing
print("3. Step-based Slicing:")
print("b[::2]   - every 2nd character:", repr(b[::2]))        # "jkh el hi "
print("b[1::2]  - every 2nd from index 1:", repr(b[1::2]))     # "sdfel a "
print("b[::3]   - every 3rd character:", repr(b[::3]))        # "jf hoia"
print()

# 4. Reverse Slicing
print("4. Reverse Slicing:")
print("b[::-1]  - complete reverse:", repr(b[::-1]))         # "avihs olleh hfkdj"
print("b[::-2]  - every 2nd in reverse:", repr(b[::-2]))      # "aih ofk"
print("b[-1::-1] - reverse using negative start:", repr(b[-1::-1])) # same as [::-1]
print()

# 5. Complex Slicing Patterns
print("5. Complex Slicing Patterns:")
print("b[-1:0:-1] - reverse excluding first char:", repr(b[-1:0:-1])) # "avihs olleh hfkd"
print("b[-2::-2]  - reverse every 2nd from second last:", repr(b[-2::-2])) # "a h lohfk"
print("b[-2:0:-2] - specific reverse pattern:", repr(b[-2:0:-2]))  # "aih ofk"
print("b[-2:0:-3] - reverse every 3rd:", repr(b[-2:0:-3]))     # "ai  ok"
print()

# 6. Edge Cases and Special Examples
print("6. Edge Cases:")
print("b[100:]   - start beyond length:", repr(b[100:]))      # empty string
print("b[:100]   - stop beyond length:", repr(b[:100]))       # full string
print("b[::100]  - large step:", repr(b[::100]))             # first char only
print("b[::-100] - large negative step:", repr(b[::-100]))    # last char only
print()

# 7. Practical Applications
print("7. Practical Applications:")
# Extract filename without extension
filename = "document.txt"
print("Filename without extension:", filename[:-4])

# Get file extension
print("File extension:", filename[-3:])

# Check if palindrome
test_word = "radar"
print(f"Is '{test_word}' palindrome?", test_word == test_word[::-1])

# Extract every other character
print("Every other character of 'abcdef':", "abcdef"[::2])