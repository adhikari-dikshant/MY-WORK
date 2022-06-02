package Constructor_Overloading;

public class Student {
    // instance variables of the class
    int id, passoutYear;
    String name, contactNo, collegeName;

    Student(String contactNo, String collegeName, int passoutYear) {
        this.contactNo = contactNo;
        this.collegeName = collegeName;
        this.passoutYear = passoutYear;
    }

    Student(int id, String name) {
        this("935XXXXXXX", "SKNCOE", 2023);
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        // object creation
        Student s = new Student(201, "DIKSHANT SINGH ADHIKARI");
        System.out.println("PRINTING STUDENT INFORMATION: \n");
        System.out.println("NAME: " + s.name + "\nROLL NUMBER: " + s.id + "\nCONTACT NO.: " + s.contactNo + "\nCOLLEGE NAME: "
                + s.collegeName + "\nPASSING YEAR: " + s.passoutYear);
    }
}
