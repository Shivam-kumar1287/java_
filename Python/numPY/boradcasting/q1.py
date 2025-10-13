import numpy as np
discount = 10   # 10% discount
profit = 20     # 20% profit
final_price = []
final_profit = []

# Loop through a list of product prices
for price in [100, 200, 300]:
    pp=price+profit
    final_profit.append(pp)
    price = price - price * discount / 100   # Apply discount
    price = price + price * profit / 100     # Apply profit
    final_price.append(price)
print("Final Prices after discount and profit:", final_price)
print("Final Prices after adding profit directly:", final_profit)

