import numpy as np

# ------------------------------------------------------------
# Create an array containing a NaN (Not a Number) value
# ------------------------------------------------------------
arr = np.array([1, 2, np.nan, 4, 5])

print("Original Array:")
print(arr)
print()

# ------------------------------------------------------------
# Detecting NaN values
# ------------------------------------------------------------
print("Is NaN:", np.isnan(arr))                   # True where NaN is present
print("Count of NaN values:", np.count_nonzero(np.isnan(arr)))
print("Count of non-NaN values:", np.count_nonzero(~np.isnan(arr)))
print()

# ------------------------------------------------------------
# Statistical Functions (that ignore NaN values)
# ------------------------------------------------------------
print("Sum (ignoring NaN):", np.nansum(arr))
print("Mean (ignoring NaN):", np.nanmean(arr))
print("Standard Deviation (ignoring NaN):", np.nanstd(arr))
print("Variance (ignoring NaN):", np.nanvar(arr))
print("Minimum (ignoring NaN):", np.nanmin(arr))
print("Maximum (ignoring NaN):", np.nanmax(arr))
print()

# ------------------------------------------------------------
# Cleaning or Replacing NaN Values
# ------------------------------------------------------------
print("Array after removing NaN values:", arr[~np.isnan(arr)])         # Filter out NaN
print("Array after replacing NaN with 0:", np.nan_to_num(arr, nan=0.0))
print("Array after replacing NaN with mean:", np.where(np.isnan(arr), np.nanmean(arr), arr))
print("Array after replacing NaN with median:", np.where(np.isnan(arr), np.nanmedian(arr), arr))
print("Array after replacing NaN with max:", np.where(np.isnan(arr), np.nanmax(arr), arr))
print("Array after replacing NaN with min:", np.where(np.isnan(arr), np.nanmin(arr), arr))
print("Array after replacing NaN with custom value (99):", np.where(np.isnan(arr), 99, arr))
print()

# ------------------------------------------------------------
# Forward and Backward Fill
# ------------------------------------------------------------
# Forward fill = fill with previous valid value
forward_fill = np.copy(arr)
mask = np.isnan(forward_fill)
forward_fill[mask] = np.maximum.accumulate(np.where(mask, np.nanmin(arr), forward_fill))[mask]
print("Array after forward fill:", forward_fill)

# Backward fill = fill with next valid value
backward_fill = np.copy(arr[::-1])
mask = np.isnan(backward_fill)
backward_fill[mask] = np.maximum.accumulate(np.where(mask, np.nanmin(arr), backward_fill))[mask]
print("Array after backward fill:", backward_fill[::-1])
print()

# ------------------------------------------------------------
# Interpolation Techniques
# ------------------------------------------------------------
# Linear interpolation between non-NaN values
interp_linear = np.interp(np.arange(len(arr)), np.flatnonzero(~np.isnan(arr)), arr[~np.isnan(arr)])
print("Array after linear interpolation:", interp_linear)

# Polynomial/log/exponential trends can be approximated too
interp_log = np.where(np.isnan(arr),
                      np.logspace(np.log10(np.nanmin(arr[arr > 0])),
                                  np.log10(np.nanmax(arr)),
                                  len(arr)),
                      arr)
print("Array after logarithmic trend interpolation:", interp_log)
print()

# ------------------------------------------------------------
# Neighbor-based Replacement
# ------------------------------------------------------------
mean_neighbors = np.where(np.isnan(arr), (np.roll(arr, 1) + np.roll(arr, -1)) / 2, arr)
print("Array after filling NaN with mean of neighbors:", mean_neighbors)

median_neighbors = np.where(np.isnan(arr),
                            np.median([np.roll(arr, 1), np.roll(arr, -1)], axis=0),
                            arr)
print("Array after filling NaN with median of neighbors:", median_neighbors)
