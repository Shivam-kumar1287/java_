# ===============================================================
# NUMPY ARRAY STACKING AND BASIC FUNCTIONS EXPLAINED
# ===============================================================

import numpy as np

# Show the NumPy version (useful for checking compatibility)
print("NumPy version:", np.__version__)

print("\n--- Horizontal and Vertical Stacking ---")

# ---------------------------------------------------------------
# Create two 2x2 arrays (matrices)
# ---------------------------------------------------------------
arr1 = np.array([[1, 2],
                 [3, 4]])

arr2 = np.array([[5, 6],
                 [7, 8]])

print("Array 1:\n", arr1)
print("Array 2:\n", arr2)

# ---------------------------------------------------------------
# HORIZONTAL STACKING (joins side by side)
# ---------------------------------------------------------------
# hstack = horizontal stacking → combine arrays column-wise
h = np.hstack((arr1, arr2))

print("\nHorizontal stacking (np.hstack):")
print(h)
print("Shape after horizontal stacking:", h.shape)
# Shape: (2,4) → 2 rows, 4 columns (side-by-side join)

# ---------------------------------------------------------------
# VERTICAL STACKING (joins one below another)
# ---------------------------------------------------------------
# vstack = vertical stacking → combine arrays row-wise
v = np.vstack((arr1, arr2))

print("\nVertical stacking (np.vstack):")
print(v)
print("Shape after vertical stacking:", v.shape)
# Shape: (4,2) → 4 rows, 2 columns (top-to-bottom join)

# ===============================================================
# BASIC NUMPY FUNCTIONS AND THEIR MEANING
# ===============================================================

# 1️⃣ MINIMUM VALUE
# Finds the smallest element in the array
print("\nMinimum value in v:", v.min())

# 2️⃣ MAXIMUM VALUE
# Finds the largest element in the array
print("Maximum value in v:", v.max())

# 3️⃣ SUM
# Adds up all elements in the array
print("Sum of all elements in v:", v.sum())

# 4️⃣ MEAN (AVERAGE)
# Calculates the average value of all elements
print("Mean (average) of v:", v.mean())

# 5️⃣ VARIANCE
# Measures how far each element is from the mean (spread of data)
# Formula: variance = mean((x - mean)^2)
print("Variance of v:", v.var())

# 6️⃣ STANDARD DEVIATION
# Square root of variance → shows how much the values vary from the mean
# Formula: std = sqrt(variance)
print("Standard deviation of v:", v.std())

# 7️⃣ PRODUCT
# Multiplies all elements together
print("Product of all elements in v:", v.prod())

# 8️⃣ FLATTEN
# Converts a multi-dimensional array into a 1D array
print("Flattened version of v:\n", v.flatten())

# 9️⃣ AXIS-BASED MIN/MAX
# Axis=0 → column-wise, Axis=1 → row-wise
print("\nColumn-wise minimum values:\n", v.min(axis=0))
print("Row-wise minimum values:\n", v.min(axis=1))
print("Column-wise maximum values:\n", v.max(axis=0))
print("Row-wise maximum values:\n", v.max(axis=1))

# 10️⃣ TRANSPOSE
# Flips rows and columns (used often in matrix operations)
print("\nTranspose of v:\n", v.T)


# Function	Meaning	Formula / Description	Example Result
# .min()	Minimum value	Smallest number in array	1
# .max()	Maximum value	Largest number in array	8
# .sum()	Sum	Adds all numbers	36
# .mean()	Average	(Sum of all elements) ÷ (count)	4.5
# .var()	Variance	Average of squared distance from mean	Measures spread
# .std()	Standard Deviation	√Variance	Average distance from mean
# .prod()	Product	Multiplies all numbers	40320
# .flatten()	Flatten	Converts 2D → 1D	[1,2,3,4,5,6,7,8]
# .T	Transpose	Flips rows ↔ columns	Useful in matrix math