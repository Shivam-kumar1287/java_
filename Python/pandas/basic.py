import pandas as pd
import os


# how to read a csv file using pandas
# df = pd.read_csv('file.csv')
# print(df.head())

# how to read an excel file using pandas
# df = pd.read_excel('file.xlsx')
# print(df.head())

# how to read a json file using pandas
# df = pd.read_json('file.json')
# print(df.head())

data = {
    "name": ["shiva", "raj", "rama", "shivani", "raju"],
    "age": [23, 34, 45, 23, 34],
    "city": ["hyd", "bang", "chennai", "delhi", "mumbai"]
}

df = pd.DataFrame(data)

print("How to create and read a DataFrame using pandas:")
print("df = pd.DataFrame(data)")
print(df)

print("if not need of index in printing DataFrame:")
print(df.to_string(index=False))

# --- Save the DataFrame as a CSV file ---
print("\nSaving DataFrame as a CSV file...")
df.to_csv('file.csv', index=False)
print("File created successfully!")

# --- Check if the file exists ---
print("\nChecking if the file was created...")
if os.path.exists('file.csv'):
    print("File exists!")
else:
    print("File not found.")

# --- Show the full file path ---
print("\nFile location:")
print(os.path.abspath('file.csv'))

# --- Read back the CSV file using pandas ---
print("\nReading the CSV file we just created:")
df_csv = pd.read_csv('file.csv')
print(df_csv)

# --- Optional: Show where script is running ---
print("\nCurrent working directory:")
print(os.getcwd())

# --- Save DataFrame to multiple file formats ---
print("\nHow to make DataFrame files using pandas:")

# Save as Excel
df.to_excel('filexlxs.xlsx', index=False)
print("Excel file created successfully!")

# Save as JSON (index=False not needed)
df.to_json('filejson.json')
print("JSON file created successfully!")

