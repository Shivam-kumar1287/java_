import pandas as pd

# Step 1: Create the data dictionary
data = {
    "Order Id": [101, 102, 103, 104, 105],
    "Customer": ["shiva", "raj", "rama", "shivani", "raju"],
    "Sale": [250, 30, 3403, 34, 34],
    "Quality": [2, 1, 3, 2, 2],
    "Order Date": ["2024-03-05", "2024-05-05", "2024-09-05", "2024-03-05", "2024-01-05"]
}

# Step 2: Create DataFrame
df_manual = pd.DataFrame(data)
print("Manual DataFrame:\n", df_manual)
print("\nColumns:", df_manual.columns)

# Step 3: Load CSV dataset