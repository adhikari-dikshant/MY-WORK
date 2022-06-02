package UDEMY.module3;

import UDEMY.module2.LeapYear;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)
                || year % 400 == 0 && (year >= 1 && year <= 9999)) {
            return true;
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                System.out.println("31 Days");
                break;
        
            case 4, 6, 9, 11:
                days = 30;
                System.out.println("30 Days");
                break;

            case 2:
            if (isLeapYear(year)) {
                days = 29;
                System.out.println("29 Days");
            }else{
                days = 28;
                System.out.println("28 Days");
            }
            default:
                System.out.println("Invalid Input");
                break;
        }
        return days;
    }
}
