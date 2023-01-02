# initialize variables
high = 0
new_num = 0
new_num = float(input("Enter a number: "))

# determine if first number is positive or negative

if(new_num <= 0):
    print("No positive number was entered.")
else:
    high = new_num
    while(new_num > 0):
        new_num = float(input("Enter a number: "))
        if (new_num > high):
            high = new_num
    formattedhigh = "{:.2f}".format(high)
    print("The highest number entered was " + str(formattedhigh))