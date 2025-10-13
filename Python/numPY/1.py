import numpy as np
print(np.__version__)

list1 = [1, 2, 3, 4, 5]
# print(list1)
array1 = np.array(list1)
# print(array1)
# new_array = np.array([[1, 2, 3], [4, 5, 6]])
# print("original array")
# print(new_array)
# print("after deleting 1st row")
# newarr2=np.delete(new_array,0,axis=0)
# print(newarr2)
print("multiplication")
res=array1*2
print(res)

print("Horizontal stacking")
print("vertical stacking")
arr1=np.array([[1,2],[3,4]])
arr2=np.array([[5,6],[7,8]])
h=np.hstack((arr1,arr2))
print("horizontal stacking")
print(h)
print("vertical stacking")
v=np.vstack((arr1,arr2))
print(v)
