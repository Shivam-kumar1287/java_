import pandas as pd

# df = pd.read_json(r"C:\Users\Shivam\OneDrive\Desktop\MYFiles\CODE\Python\pandas\sample_Data.json")
#print(df)
# print("top five rows of the DataFrame:")
# print(df.head(5))
# print("\nlast three rows of the DataFrame:")
# print(df.tail(3))

# print("\nDataFrame information:")
# print(df.info())

data = {
    "name": ["shiva", "raj", "rama", "shivani", "raju"],
    "age": [23, 34, 45, 23, 34],
    "city": ["hyd", "bang", "chennai", "delhi", "mumbai"]
}

df=pd.DataFrame(data)
print(df.info())
print("\nDataFrame description:"  )
print(df.describe())
print("\nDataFrame columns:"  )
print(df.columns)
print("\nDataFrame index:"  )
print(df.index)
print("\nDataFrame values:"  )
print(df.values)
print("\nDataFrame shape:"  )
print(df.shape)
print("\nDataFrame dtypes:"  )
print(df.dtypes)
print("\nDataFrame memory usage:"  )
print(df.memory_usage())
print("\nDataFrame head():"  )
print(df.head())
print("\nDataFrame tail():"  )
print(df.tail())
print("\nDataFrame sample():"  )
print(df.sample())
print("\nDataFrame info():"  )
print(df.info())
print("\nDataFrame to_string():"  )
print(df.to_string())
print("\nDataFrame to_dict():"  )
print(df.to_dict())
print("\nDataFrame to_numpy():"  )
print(df.to_numpy())
print("\nDataFrame to_csv():"  )
print(df.to_csv(index=False))
print("\nDataFrame to_excel():"  )
