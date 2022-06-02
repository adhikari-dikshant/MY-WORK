package UDEMY.module2;

public class speedConvertor {
    public static void main(String[] args) {
        toMilesPerHour(90.00);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println( kilometersPerHour + " km/hr = " + milesPerHour + " mi/hr");
        }
    }
}

