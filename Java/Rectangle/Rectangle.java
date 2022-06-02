package Rectangle;

import java.util.Scanner;

public class Rectangle {
    private double getWidth;
    private double getLength;
    double findArea;
    String getColor;
    Scanner s = new Scanner(System.in);

    Rectangle() { // constructor use hua hain yaha
        System.out.print("ENTER THE LENGTH: ");
        getLength = s.nextDouble();
        System.out.print("ENTER THE WIDTH: ");
        getWidth = s.nextDouble();
        System.out.print("ENTER THE COLOR: ");
        getColor = s.next();
        findArea = getLength * getWidth;
        System.out.println("AREA OF RECTANGLE: " + findArea);
    }
}

class Output { // main class hain ye
    public static void main(String[] args) {
        System.out.println("FIRST RECTANGLE: ");
        Rectangle r1 = new Rectangle();
        System.out.println("SECOND RECTANGLE: ");
        Rectangle r2 = new Rectangle();
        if (r1.findArea == r2.findArea && r1.getColor.equals(r2.getColor)) {
            System.out.println("MATCHING RECTANGLE");
        } else {
            System.out.println("NON-MATCHING RECTANGLE");
        }
    }
}