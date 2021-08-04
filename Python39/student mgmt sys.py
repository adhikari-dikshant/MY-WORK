# Student Management System

# Fields :- ['roll', 'name', 'age', 'email', 'phone']
# 1. Add New Student
# 2. View Students
# 3. Search Student
# 4. Update Student
# 5. Delete Student
# 6. Quit


import csv
# Define global variables
student_fields = ['roll', 'name', 'age', 'email', 'phone']
student_database = 'students.csv'


def display_menu():
    print("--------------------------------------")
    print(" WELCOME TO STUDENT MANAGEMENT SYSTEM")
    print("---------------------------------------")
    print("1. ADD NEW STUDENT")
    print("2. VIEW STUDENTS")
    print("3. SEARCH STUDENT")
    print("4. UPDATE STUDENT")
    print("5. DELETE STUDENT")
    print("6. QUIT")


def add_student():
    print("-------------------------")
    print("ADD STUDENT INFORMATION")
    print("-------------------------")
    global student_fields
    global student_database

    # [ ['1','2'] ]
    student_data = []
    for field in student_fields:
        value = input("ENTER " + field + ": ")
        student_data.append(value)

    with open(student_database, "a", encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerows([student_data])

    print("DATA SAVED SUCCESSFULLY")
    input("PRESS ANY KEY TO CONTINUE")
    return


def view_students():
    global student_fields
    global student_database

    print("--- STUDENT RECORDS ---")

    with open(student_database, "r", encoding="utf-8") as f:
        reader = csv.reader(f)
        for x in student_fields:
            print(x, end='\t |')
        print("\n-----------------------------------------------------------------")

        for row in reader:
            for item in row:
                print(item, end="\t |")
            print("\n")

    input("PRESS ANY KEY TO CONTINUE")


def search_student():
    global student_fields
    global student_database

    print("--- SEARCH STUDENT ---")
    roll = input("ENTER ROLL NO. TO SEARCH: ")
    with open(student_database, "r", encoding="utf-8") as f:
        reader = csv.reader(f)
        for row in reader:
            if len(row) > 0:
                if roll == row[0]:
                    print("----- STUDENT FOUND -----")
                    print("ROLL: ", row[0])
                    print("NAME: ", row[1])
                    print("AGE: ", row[2])
                    print("EMAIL: ", row[3])
                    print("PHONE: ", row[4])
                    break
        else:
            print("ROLL NO. NOT FOUND IN OUR DATABASE")
    input("PRESS ANY KEY TO CONTINUE")


def update_student():
    global student_fields
    global student_database

    print("--- UPDATE STUDENT ---")
    roll = input("ENTER ROLL NO. TO UPDATE: ")
    index_student = None
    updated_data = []
    with open(student_database, "r", encoding="utf-8") as f:
        reader = csv.reader(f)
        counter = 0
        for row in reader:
            if len(row) > 0:
                if roll == row[0]:
                    index_student = counter
                    print("STUDENT FOUND: AT INDEX ", index_student)
                    student_data = []
                    for field in student_fields:
                        value = input("ENTER " + field + ": ")
                        student_data.append(value)
                    updated_data.append(student_data)
                else:
                    updated_data.append(row)
                counter += 1

    # Check if the record is found or not
    if index_student is not None:
        with open(student_database, "w", encoding="utf-8") as f:
            writer = csv.writer(f)
            writer.writerows(updated_data)
    else:
        print("ROLL NO. NOT FOUND IN OUR DATABASE")

    input("PRESS ANY KEY TO CONTINUE")


def delete_student():
    global student_fields
    global student_database

    print("--- DELETE STUDENT ---")
    roll = input("ENTER ROLL NO. TO DELETE: ")
    student_found = False
    updated_data = []
    with open(student_database, "r", encoding="utf-8") as f:
        reader = csv.reader(f)
        counter = 0
        for row in reader:
            if len(row) > 0:
                if roll != row[0]:
                    updated_data.append(row)
                    counter += 1
                else:
                    student_found = True

    if student_found is True:
        with open(student_database, "w", encoding="utf-8") as f:
            writer = csv.writer(f)
            writer.writerows(updated_data)
        print("ROLL NO. ", roll, "DELETED SUCCESSFULLY")
    else:
        print("ROLL NO. NOT FOUND IN OUR DATABASE")

    input("PRESS ANY KEY TO CONTINUE")


while True:
    display_menu()

    choice = input("ENTER YOUR CHOICE: ")
    if choice == '1':
        add_student()
    elif choice == '2':
        view_students()
    elif choice == '3':
        search_student()
    elif choice == '4':
        update_student()
    elif choice == '5':
        delete_student()
    else:
        break

print("-------------------------------")
print(" THANK YOU FOR USING OUR SYSTEM")
print("-------------------------------")
