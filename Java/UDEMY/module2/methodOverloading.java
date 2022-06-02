package UDEMY.module2;

public class methodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches <= 12) {
            double centimeters = feet * 2.54 * inches;
            centimeters += inches * 2.54;   // inches condition in total addition
            System.out.println("Your totals cms is: " + feet + " ft + " + inches + " in = " + centimeters + " cm.");
            return 1;
        }else{
            System.out.println("Invalid Input");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double in = (int) inches % 12;
            System.out.println(inches + " in = " + feet + " ft and " + in + " in.");
            return calcFeetAndInchesToCentimeters(feet, in);
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(78, 12);
        if (centimeters < 0.0) {
            System.out.println("Invalid prameters");
        }
        calcFeetAndInchesToCentimeters(89);
    }
}
