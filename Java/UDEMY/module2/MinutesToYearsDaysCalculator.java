package UDEMY.module2;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long years = minutes / 525600;
            long minutesLeft = minutes - (years * 525600);
            long days = minutesLeft / 1440;
            System.out.println(minutes + " minutes equals to: " + years + " years and " + days + " days.");
        }else{
            System.out.println("Invalid Arguments");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(267593737);
    }
}
