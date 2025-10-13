import numpy as np
arr1=np.array([[1,2],[3,4]])
print("original array")
print(arr1)
print("after splitting")
newarr=np.array_split(arr1,2)
print(newarr)