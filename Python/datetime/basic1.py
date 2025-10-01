import datetime

x = datetime.datetime.now()

print(x)             # full date + time
print(x.date())      # only date
print(x.strftime("%x"))  # local version of date (MM/DD/YY format)
print(x.strftime("%f"))
print(x.strftime("%z"))
print(x.strftime("%B - %Y %I-%p "))






