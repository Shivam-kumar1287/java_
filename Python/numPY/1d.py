import numpy as np

print("=" * 50)
print("NUMPY ARRAYS - COMPLETE GUIDE")
print("=" * 50)

# =============================================================================
# 1D ARRAY OPERATIONS
# =============================================================================
print("\n" + "="*20 + " 1D ARRAY " + "="*20)

arr1d = np.array([1, 2, 3, 4, 5, 6])
print(f"1D Array: {arr1d}")
print(f"Type: {type(arr1d)}")
print(f"Dimensions: {arr1d.ndim}")
print(f"Shape: {arr1d.shape}")
print(f"Size: {arr1d.size}")
print(f"Data Type: {arr1d.dtype}")
print(f"Item Size: {arr1d.itemsize} bytes")
print(f"Total Bytes: {arr1d.nbytes} bytes")

# =============================================================================
# 2D ARRAY OPERATIONS
# =============================================================================
print("\n" + "="*20 + " 2D ARRAY " + "="*20)

arr2d = np.array([[1, 2, 3], [4, 5, 6]])
print(f"2D Array:\n{arr2d}")
print(f"Type: {type(arr2d)}")
print(f"Dimensions: {arr2d.ndim}")
print(f"Shape: {arr2d.shape}")  # (rows, columns)
print(f"Size: {arr2d.size}")    # total elements
print(f"Data Type: {arr2d.dtype}")
print(f"Item Size: {arr2d.itemsize} bytes")
print(f"Total Bytes: {arr2d.nbytes} bytes")

# =============================================================================
# ARRAY MANIPULATION
# =============================================================================
print("\n" + "="*20 + " ARRAY MANIPULATION " + "="*20)

print(f"Flattened: {arr2d.flatten()}")  # Convert 2D to 1D

print(f"Reshape to (3, 2):\n{arr2d.reshape(3, 2)}")
print(f"Reshape to (6, 1):\n{arr2d.reshape(6, 1)}")
print(f"Reshape to (1, 6):\n{arr2d.reshape(1, 6)}")

print(f"Transpose:\n{arr2d.T}")  # Swap rows and columns

# =============================================================================
# ARRAY INDEXING
# =============================================================================
print("\n" + "="*20 + " ARRAY INDEXING " + "="*20)

print(f"Element at [1, 2]: {arr2d[1, 2]}")  # Row 1, Column 2
print(f"Element at [0, 1]: {arr2d[0, 1]}")  # Row 0, Column 1
print(f"Entire row at [0]: {arr2d[0]}")     # First row

# Additional indexing examples
print(f"First column: {arr2d[:, 0]}")       # All rows, column 0
print(arr2d)
print(f"Slice [0:2, 1:3]:\n{arr2d[0:2, 1:3]}")  # Sub-array

# =============================================================================
# ARRAY CREATION METHODS
# =============================================================================
print("\n" + "="*20 + " OTHER CREATION METHODS " + "="*20)

# Different ways to create arrays
zeros_arr = np.zeros((2, 3))
ones_arr = np.ones((2, 2))
range_arr = np.arange(0, 10, 2)  # Start, stop, step
linspace_arr = np.linspace(0, 1, 5)  # Start, stop, num_points
random_arr = np.random.random((2, 2))

print(f"Zeros array:\n{zeros_arr}")
print(f"Ones array:\n{ones_arr}")
print(f"Range array: {range_arr}")
print(f"Linspace array: {linspace_arr}")
print(f"Random array:\n{random_arr}")

# =============================================================================
# ARRAY OPERATIONS
# =============================================================================
print("\n" + "="*20 + " ARRAY OPERATIONS " + "="*20)

a = np.array([1, 2, 3])
b = np.array([4, 5, 6])

print(f"Array a: {a}")
print(f"Array b: {b}")
print(f"a + b: {a + b}")        # Element-wise addition
print(f"a * b: {a * b}")        # Element-wise multiplication
print(f"a ** 2: {a ** 2}")      # Element-wise power
print(f"sin(a): {np.sin(a)}")   # Mathematical functions

print("\n" + "="*50)
print("PROGRAM COMPLETED SUCCESSFULLY!")
print("="*50)