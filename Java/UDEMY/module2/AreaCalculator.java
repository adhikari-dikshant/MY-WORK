package UDEMY.module2;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius >= 0) {
            double areaCircle = radius * radius * Math.PI;
            System.out.println("Area Of Circle: " + areaCircle + " sq unit");
            return areaCircle;
        }else{
            System.out.println("Invalid radius input.");
            return -1;
        }
    }

    public static double area(double x, double y){
        if (x >= 0 && y >= 0) {
            double areaRect = x * y;
            System.out.println("Area Of Rectangle: " + areaRect + " sq unit");
            return areaRect;
        }else{
            System.out.println("Invalid rectangle arguments.");
            return -1;
        }
    }

    public static void main(String[] args) {
        area(90.0);
        area(-8, 8);
    }
}
