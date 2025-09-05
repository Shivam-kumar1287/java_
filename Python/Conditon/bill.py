while True:

    name = input("Enter the name of the product: ")
    total = 0
    while True:
            amount = float(input("Amount: "))
            quantity = int(input("Quantity: "))
              total = amount * quantity
            repeat = input("Do you want to add more quantity of the same product? (yes/no): ").strip().lower()
            if repeat == 'no':
                break
    print("-" * 40)
    print(f"Total amount for {name}: {total}")
    print(f"The total amount for {quantity} {name}(s) is: {total}")
    print("-" * 40)
 