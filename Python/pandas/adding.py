import pandas as pd
import sys

data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David'],
      'Age': [24, 30, 22, 35],
    'City': ['New York', 'Los Angeles', 'Chicago', 'Houston'],
    'salary': [70000, 80000, 65000, 90000],
    'performance_score': [88, 92, 85, 95]    
}

df = pd.DataFrame(data)

# Ensure Unicode output works in Windows terminal
print(df)

# Add 5 to Age column
df["Age_plus_5"] = df["Age"] + 5

print("\nDataFrame after adding 5 to Age column:")
print(df)  # prints full DataFrame

# Add 10,000 to salary for rows where performance_score > 90
df['performance < 90 ']=df.loc[df['performance_score'] > 90, 'salary'] += 10000
print("\nDataFrame after adding 10,000 to salary for high performers:")
print(df)

#loc
#df.loc[row_indexer, column_indexer]=new value
