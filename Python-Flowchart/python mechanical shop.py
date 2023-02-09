import time

print("\nThe autoshop is opening!!")
for i in range(5, 0, -1):
    print(i)
    time.sleep(0.5)
print("=====WELCOME TO DDGR MOTORSPORTS!!=====\n ")
print("====SALE 10%=//=SALE 10%=//=SALE 10%===\n ")

name = str(input("What is your full name?: "))
number = str(input("Please enter your contact number?: "))
address = str(input("Please enter your Email Address?: "))

print("\nWelcome dear costumer")
print("Here's a list of Services" )
with open("Inventory.txt", mode = 'r') as f:
    content = f.read()
    print(content)

yes_choices = ['yes', 'y']
no_choices = ['no', 'n']

Electrical_Repairs = 1
Maintenance_Check = 2
AC_Repairs = 3
Paint_Job = 4
Oil_Change = 5
ECU_REMAP = 6
DYNO_TEST = 7

items = int(input("Please select a number of the service type that you want to choose: \n"))
if items == Electrical_Repairs:
    with open("Electrical_Repairs.txt", mode='r') as f:
        content = f.read()
        print(content)
    Stock_1 = 2100
    Stock_2 = 2100
    Stock_3 = 800

    S1 = 1
    S2 = 2
    S3 = 3
    while True:
        user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
        if user_inputappoint.lower() in yes_choices:
            print(" 1 - Battery connection problems:\n 2 - Dashboard problems\n 3 - Alternator problems")
            Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
            if Chosen == S1:
                price_total = Stock_1
                discount = price_total * 2 / 100 ;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S2:
                price_total = Stock_2
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S3:
                price_total = Stock_3
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
        elif user_inputappoint.lower() in no_choices:
            print('user typed no')
            quit()
            break
        else:
            print('Type yes or no')
            continue
    quit();
elif items == Maintenance_Check:
    with open("Maintenance_Check.txt", mode='r') as f:
        content = f.read()
        print(content)
    Stock_1 = 15000
    Stock_2 = 6000

    S1 = 1
    S2 = 2
    S3 = 3
    while True:
        user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
        if user_inputappoint.lower() in yes_choices:
            print(" 1 - General Check-up:\n 2 - Engine Check-Up")
            Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
            if Chosen == S1:
                price_total = Stock_1
                discount = price_total * 2 / 100 ;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S2:
                price_total = Stock_2
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
        elif user_inputappoint.lower() in no_choices:
            print('user typed no')
            quit()
            break
        else:
            print('Type yes or no')
            continue

elif items == AC_Repairs:
    with open("AC_Repairs.txt", mode='r') as f:
        content = f.read()
        print(content)
    Stock_1 = 5000
    Stock_2 = 5000
    Stock_3 = 6000
    Stock_4 = 8000

    S1 = 1
    S2 = 2
    S3 = 3
    S4 = 4
    while True:
        user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
        if user_inputappoint.lower() in yes_choices:
            print(" 1 - Condenser Repair:\n 2 - Compressor Repair\n 3 - Condenser Replacement\n 4 - Compressor Replacement")
            Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
            if Chosen == S1:
                price_total = Stock_1
                discount = price_total * 2 / 100;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S2:
                price_total = Stock_2
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S3:
                price_total = Stock_3
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S4:
                price_total = Stock_4
                discount = price_total * 2 / 100;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
        elif user_inputappoint.lower() in no_choices:
            print('user typed no')
            quit()
            break
        else:
            print('Type yes or no')
            continue

elif items == Paint_Job:
    with open("Paint_Job.txt", mode='r') as f:
        content = f.read()
        print(content)
    Stock_1 = 35000
    Stock_2 = 15000

    S1 = 1
    S2 = 2
    while True:
        user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
        if user_inputappoint.lower() in yes_choices:
            print(" 1 - Whole body Repaint:\n 2 - Dent/Damage Repaint:\n ")
            Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
            if Chosen == S1:
                price_total = Stock_1
                discount = price_total * 2 / 100;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S2:
                price_total = Stock_2
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
        elif user_inputappoint.lower() in no_choices:
            print('user typed no')
            quit()
            break
        else:
            print('Type yes or no')
            continue

elif items == Oil_Change:
    with open("Oil_Change.txt", mode='r') as f:
        content = f.read()
        print(content)
    Stock_1 = 7000
    Stock_2 = 5000

    S1 = 1
    S2 = 2
    S3 = 3
    while True:
        user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
        if user_inputappoint.lower() in yes_choices:
            print(" 1 - Synthetic Oil:\n 2 - Non-Synthetic Oil")
            Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
            if Chosen == S1:
                price_total = Stock_1
                discount = price_total * 2 / 100;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S2:
                price_total = Stock_2
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S3:
                price_total = Stock_3
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
        elif user_inputappoint.lower() in no_choices:
            print('user typed no')
            quit()
            break
        else:
            print('Type yes or no')
            continue

elif items == ECU_REMAP:
    with open("ECU_REMAP.txt", mode='r') as f:
        content = f.read()
        print(content)
    Stock_1 = 15000
    Stock_2 = 10000

    S1 = 1
    S2 = 2
    while True:
        user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
        if user_inputappoint.lower() in yes_choices:
            print(" 1 - Stock ECU Remap:\n 2 - Brand New ECU Tuning")
            Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
            if Chosen == S1:
                price_total = Stock_1
                discount = price_total * 2 / 100;
                Invoicetotal = price_total - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
            if Chosen == S2:
                price_total = Stock_2
                discount = price_total * 0.15 / 100;
                Invoicetotal = overAllPrice - discount;
                print("==============================================")
                print("You Have Availed / Battery Connection Problems")
                print("Your Price total is", u"\u20B1", price_total)
                print("================10% DISCOUNT==================")
                print("Your Invoice total is", u"\u20B1", Invoicetotal)
                print("=-PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                break
        elif user_inputappoint.lower() in no_choices:
            print('user typed no')
            quit()
            break
        else:
            print('Type yes or no')
            continue

elif items == DYNO_TEST:
        with open("DYNO_TEST.txt", mode='r') as f:
            content = f.read()
            print(content)
        Stock_1 = 10000

        S1 = 1
        while True:
            user_inputappoint = input('Would you like to book for an appointment? (yes/no): ')
            if user_inputappoint.lower() in yes_choices:
                print(" 1 - Power Reading:\n ")
                Chosen = int(input("Please select a number of the service type that you want to choose: \n"))
                if Chosen == S1:
                    price_total = Stock_1
                    discount = price_total * 2 / 100;
                    Invoicetotal = price_total - discount;
                    print("==============================================")
                    print("You Have Availed / Battery Connection Problems")
                    print("Your Price total is", u"\u20B1", price_total)
                    print("================10% DISCOUNT==================")
                    print("Your Invoice total is", u"\u20B1", Invoicetotal)
                    print("==PLEASE CHECK YOUR EMAIL FOR RECEIPT DETAILS=\n-", address)
                    print("====THANK YOU FOR AVAILING OUR SERVICE!!======")
                    break
            elif user_inputappoint.lower() in no_choices:
                print('user typed no')
                quit()
                break
            else:
                print('Type yes or no')
                continue
