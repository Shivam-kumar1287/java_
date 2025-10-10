import sys
import pandas as pd

# Ensure Unicode output works in Windows terminal
sys.stdout.reconfigure(encoding='utf-8')

# Step 1: Load the CSV file
dataset_path = r"C:\Users\Shivam\Downloads\train.csv"
df_csv = pd.read_csv(dataset_path)

# Step 2: Basic information
print("🔹 Shape of dataset:", df_csv.shape)
print("\n🔹 Column names:\n", df_csv.columns.to_list())
print("\n🔹 Data types:\n", df_csv.dtypes)

# Step 3: Missing values and duplicates
print("\n🔹 Missing values per column:\n", df_csv.isnull().sum())
print("\n🔹 Number of duplicate rows:", df_csv.duplicated().sum())

# Step 4: Unique value counts
print("\n🔹 Unique value counts per column:\n", df_csv.nunique())

# Step 5: Statistical summary (numeric columns)
print("\n🔹 Statistical summary for numeric columns:\n", df_csv.describe())

# Step 6: Preview first and last rows
print("\n🔹 First 5 rows:\n", df_csv.head())
print("\n🔹 Last 5 rows:\n", df_csv.tail())

# Step 7: Optional: Columns with few unique values (categorical candidates)
few_unique = df_csv.nunique()[df_csv.nunique() < 10]
print("\n🔹 Columns with less than 10 unique values (possible categorical):\n", few_unique)

# Step 6: Top values per column (mode and frequency)
print("\n🔹 Top value and frequency per column:")
top_values = pd.DataFrame({
    "Top Value": df.mode().iloc[0],
    "Frequency": df.apply(lambda x: x.value_counts().iloc[0])
})
print(top_values)

# Step 7: Optional: summary DataFrame for all columns
eda_summary = pd.DataFrame({
    "Data Type": df.dtypes,
    "Null Count": df.isnull().sum(),
    "Unique Count": df.nunique(),
    "Top Value": df.mode().iloc[0],
    "Top Value Freq": df.apply(lambda x: x.value_counts().iloc[0])
})
print("\n🔹 Full EDA Summary Table:\n", eda_summary)