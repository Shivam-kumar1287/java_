# ==============================
# MATRIX OPERATIONS IN NUMPY
# ==============================

# Import numpy module
import numpy as np

# Create a 2x4 matrix using np.asmatrix()
# (np.mat() is removed in NumPy 2.0, so np.asmatrix() is used temporarily)
matrix = np.asmatrix([
    [1, 2, 3, 4],
    [1, 2, 3, 4]
])

# -------------------------------
# BASIC INFORMATION
# -------------------------------
print("Matrix:\n", matrix)
print("Type:", type(matrix))        # Type of object
print("Dimension (ndim):", matrix.ndim)  # Always 2 for matrices
print("Shape:", matrix.shape)       # (rows, columns)
print("Total elements (size):", matrix.size)
print("Data type (dtype):", matrix.dtype)
print("Item size (bytes per element):", matrix.itemsize)
print("Total bytes (nbytes):", matrix.nbytes)

# -------------------------------
# TRANSPOSE AND BASIC PROPERTIES
# -------------------------------
print("\nTranspose (T):\n", matrix.T)   # Flip rows & columns
print("As Array (A):\n", matrix.A)      # Convert matrix to ndarray
print("As 1D Array (A1):", matrix.A1)   # Flatten to 1D array
print("As List (tolist):", matrix.tolist())  # Convert to nested Python list
print("Flattened Matrix:\n", matrix.flatten())  # Flatten to 1D (matrix form)

# -------------------------------
# MATHEMATICAL OPERATIONS
# -------------------------------
print("\nSum of all elements:", matrix.sum())
print("Minimum value:", matrix.min())
print("Maximum value:", matrix.max())
print("Mean:", matrix.mean())
print("Standard Deviation:", matrix.std())
print("Variance:", matrix.var())
print("Product of all elements:", matrix.prod())

# -------------------------------
# AXIS-BASED OPERATIONS (on transpose)
# -------------------------------
# Axis 0 → column-wise (downwards)
# Axis 1 → row-wise (across)
print("\nColumn-wise sum of transpose:\n", matrix.T.sum(axis=0))
print("Row-wise sum of transpose:\n", matrix.T.sum(axis=1))

print("\nColumn-wise min of transpose:\n", matrix.T.min(axis=0))
print("Row-wise min of transpose:\n", matrix.T.min(axis=1))

print("\nColumn-wise max of transpose:\n", matrix.T.max(axis=0))
print("Row-wise max of transpose:\n", matrix.T.max(axis=1))

print("\nColumn-wise mean of transpose:\n", matrix.T.mean(axis=0))
print("Row-wise mean of transpose:\n", matrix.T.mean(axis=1))

print("\nColumn-wise std of transpose:\n", matrix.T.std(axis=0))
print("Row-wise std of transpose:\n", matrix.T.std(axis=1))

print("\nColumn-wise var of transpose:\n", matrix.T.var(axis=0))
print("Row-wise var of transpose:\n", matrix.T.var(axis=1))

print("\nColumn-wise product of transpose:\n", matrix.T.prod(axis=0))
print("Row-wise product of transpose:\n", matrix.T.prod(axis=1))

# -------------------------------
# ADVANCED PROPERTIES
# -------------------------------
print("\nTranspose of matrix:\n", matrix.T)
print("\nAs array (from transpose):\n", matrix.T.A)
print("As 1D array (from transpose):", matrix.T.A1)
print("As list (from transpose):", matrix.T.tolist())
print("Flattened transpose:\n", matrix.T.flatten())
print("Sum of all elements (transpose):", matrix.T.sum())

# -------------------------------
# INVERSE (only possible for square matrices)
# -------------------------------
# NOTE: Current matrix is 2x4 → NOT square → inverse not possible.
# To demonstrate inverse, create a 2x2 example matrix:
square_matrix = np.asmatrix([[1, 2], [3, 4]])
print("\nSquare Matrix:\n", square_matrix)
print("Inverse of Square Matrix:\n", square_matrix.I)
