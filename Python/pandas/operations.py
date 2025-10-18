import pandas as pd

data = {
    "name": ["shiva", "raj", "rama", "shivani", "raju"],
    "age": [23, 34, 45, 23, 34],
    "salary": [50000, 60000, 70000, 80000, 90000],
    "performance": [3.5, 4.0, 4.5, 4.2, 3.8],
    "city": ["hyd", "bang", "chennai", "delhi", "mumbai"]
}

df = pd.DataFrame(data)

# Single column
name = df['name']
print("Data in 'name' column:")
print(name)

# Info about DataFrame
print("\nDataFrame info:")
df.info()

# Select multiple columns
print("\nSelect multiple columns (name and age):")
multi_col = df[['name', 'age']]
print(multi_col)

# Filter rows where age > 30 and select specific columns
print("\nName and age where age > 30:")
age_above_30 = df.loc[df['age'] > 30, ['name', 'age']]
print(age_above_30)

print("fillter based on multiple conditions:    ")
filtered_data = df.loc[(df['age'] > 25) & (df['salary'] > 60000), ['name', 'age', 'salary']]
print(filtered_data)

filtered_datq3=df.loc[(df['performance']>=4.0) | (df['salary']>50000), ['name', 'performance', 'salary', 'city']]
print("\nfilter based on or condition:    ")
print(filtered_datq3)

