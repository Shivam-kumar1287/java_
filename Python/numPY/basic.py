import numpy as np

# 1. np.array()
arr = np.array([1, 2, 3])
print("np.array([1, 2, 3]):\n", arr)

# 2. np.ones()
ones_arr = np.ones((2, 3))
print("\nnp.ones((2, 3)):\n", ones_arr)

# 3. np.arange()
arange_arr = np.arange(0, 10, 2)
print("\nnp.arange(0, 10, 2):\n", arange_arr)

# 4. np.linspace()
linspace_arr = np.linspace(0, 1, 5)
print("\nnp.linspace(0, 1, 5):\n", linspace_arr)

# 5. np.eye()
eye_arr = np.eye(3)
print("\nnp.eye(3):\n", eye_arr)

# 6. np.random.rand()
rand_arr = np.random.rand(2, 3)
print("\nnp.random.rand(2, 3):\n", rand_arr)
