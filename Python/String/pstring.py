b = "hello shiva "

# 1. Case Conversion Methods
print("1. Case Conversion Methods:")
print(b.capitalize())    # Capitalizes first character: "Hello shiva "
print(b.lower())         # Converts to lowercase: "hello shiva "
print(b.upper())         # Converts to uppercase: "HELLO SHIVA "
print(b.title())         # Capitalizes first letter of each word: "Hello Shiva "
print(b.swapcase())      # Swaps case of all characters: "HELLO SHIVA "

# 2. Search and Count Methods
print("\n2. Search and Count Methods:")
print(b.count("l"))      # Counts occurrences of 'l': 2
print(b.find("s"))       # Returns index of first 's': 6 (-1 if not found)
print(b.rfind("l"))      # Returns index of last 'l': 3
print(b.index("s"))      # Returns index of first 's': 6 (raises error if not found)
print(b.rindex("l"))     # Returns index of last 'l': 3

# 3. Validation Methods
print("\n3. Validation Methods:")
print(b.islower())       # Checks if all characters are lowercase: True
print(b.isupper())       # Checks if all characters are uppercase: False
print(b.isalpha())       # Checks if all characters are alphabetic: False (contains space)
print(b.isalnum())       # Checks if alphanumeric: False (contains space)
print(b.isdecimal())     # Checks if all characters are decimal: False
print(b.isdigit())       # Checks if all characters are digits: False
print(b.isnumeric())     # Checks if all characters are numeric: False
print(b.isspace())       # Checks if all characters are whitespace: False
print(b.isprintable())   # Checks if all characters are printable: True
print(b.isidentifier())  # Checks if valid identifier name: False (contains space)
print(b.startswith("h")) # Checks if starts with 'h': True
print(b.endswith("a "))  # Checks if ends with 'a ': True

# 4. Transformation Methods
print("\n4. Transformation Methods:")
print(b.strip())         # Removes leading/trailing whitespace: "hello shiva"
print(b.replace("h","H")) # Replaces all 'h' with 'H': "Hello sHiva "
print(b.center(50))      # Centers string in width 50: "                  hello shiva                   "
print(b.zfill(50))       # Fills with zeros to make length 50: "000000000000000000000000000000hello shiva "

# 5. Splitting and Joining Methods
print("\n5. Splitting and Joining Methods:")
print(b.split(" "))      # Splits by space: ['hello', 'shiva', '']
print(b.splitlines())    # Splits by lines: ['hello shiva ']
print(b.partition("s"))  # Splits at first 's': ('hello ', 's', 'hiva ')
print(b.rpartition("s")) # Splits at last 's': ('hello ', 's', 'hiva ')
print(b.join(["hello","shiva"])) # Joins list with b as separator: "hellohello shiva shiva"

# 6. Encoding and Translation Methods
print("\n6. Encoding and Translation Methods:")
print(b.encode())        # Encodes to bytes: b'hello shiva '
trans_table = str.maketrans("h","H") # Creates translation table
print(b.translate(trans_table)) # Translates using table: "Hello sHiva "

# 7. Prefix/Suffix Methods (Python 3.9+)
print("\n7. Prefix/Suffix Methods:")
print(b.removeprefix("h")) # Removes prefix 'h': "ello shiva "
print(b.removesuffix("a ")) # Removes suffix 'a ': "hello shiv"

# 8. Formatting Methods
print("\n8. Formatting Methods:")
print(b.expandtabs())    # Expands tabs to spab = "hello shiva "

# 1. Case Conversion Methods
print("1. Case Conversion Methods:")
print(b.capitalize())    # Capitalizes first character: "Hello shiva "
print(b.lower())         # Converts to lowercase: "hello shiva "
print(b.upper())         # Converts to uppercase: "HELLO SHIVA "
print(b.title())         # Capitalizes first letter of each word: "Hello Shiva "
print(b.swapcase())      # Swaps case of all characters: "HELLO SHIVA "

# 2. Search and Count Methods
print("\n2. Search and Count Methods:")
print(b.count("l"))      # Counts occurrences of 'l': 2
print(b.find("s"))       # Returns index of first 's': 6 (-1 if not found)
print(b.rfind("l"))      # Returns index of last 'l': 3
print(b.index("s"))      # Returns index of first 's': 6 (raises error if not found)
print(b.rindex("l"))     # Returns index of last 'l': 3

# 3. Validation Methods
print("\n3. Validation Methods:")
print(b.islower())       # Checks if all characters are lowercase: True
print(b.isupper())       # Checks if all characters are uppercase: False
print(b.isalpha())       # Checks if all characters are alphabetic: False (contains space)
print(b.isalnum())       # Checks if alphanumeric: False (contains space)
print(b.isdecimal())     # Checks if all characters are decimal: False
print(b.isdigit())       # Checks if all characters are digits: False
print(b.isnumeric())     # Checks if all characters are numeric: False
print(b.isspace())       # Checks if all characters are whitespace: False
print(b.isprintable())   # Checks if all characters are printable: True
print(b.isidentifier())  # Checks if valid identifier name: False (contains space)
print(b.startswith("h")) # Checks if starts with 'h': True
print(b.endswith("a "))  # Checks if ends with 'a ': True

# 4. Transformation Methods
print("\n4. Transformation Methods:")
print(b.strip())         # Removes leading/trailing whitespace: "hello shiva"
print(b.replace("h","H")) # Replaces all 'h' with 'H': "Hello sHiva "
print(b.center(50))      # Centers string in width 50: "                  hello shiva                   "
print(b.zfill(50))       # Fills with zeros to make length 50: "000000000000000000000000000000hello shiva "

# 5. Splitting and Joining Methods
print("\n5. Splitting and Joining Methods:")
print(b.split(" "))      # Splits by space: ['hello', 'shiva', '']
print(b.splitlines())    # Splits by lines: ['hello shiva ']
print(b.partition("s"))  # Splits at first 's': ('hello ', 's', 'hiva ')
print(b.rpartition("s")) # Splits at last 's': ('hello ', 's', 'hiva ')
print(b.join(["hello","shiva"])) # Joins list with b as separator: "hellohello shiva shiva"

# 6. Encoding and Translation Methods
print("\n6. Encoding and Translation Methods:")
print(b.encode())        # Encodes to bytes: b'hello shiva '
trans_table = str.maketrans("h","H") # Creates translation table
print(b.translate(trans_table)) # Translates using table: "Hello sHiva "

# 7. Prefix/Suffix Methods (Python 3.9+)
print("\n7. Prefix/Suffix Methods:")
print(b.removeprefix("h")) # Removes prefix 'h': "ello shiva "
print(b.removesuffix("a ")) # Removes suffix 'a ': "hello shiv"

# 8. Formatting Methods
print("\n8. Formatting Methods:")
print(b.expandtabs())    # Expands tabs to spaces (default 8): "hello shiva "
print(b.format())        # Formats string (no placeholders): "hello shiva "ces (default 8): "hello shiva "
print(b.format())        # Formats string (no placeholders): "hello shiva "