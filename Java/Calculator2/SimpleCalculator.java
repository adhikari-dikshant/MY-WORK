package Calculator2;

import java.util.Scanner;

public class SimpleCalculator {
    private double first_no;
    private double second_no;

    public void getFirstNo() {
        System.out.println("Enter the first number");
        Scanner in = new Scanner(System.in);
        first_no = in.nextDouble();
    }

    public void getSecondNo() {
        System.out.println("Enter the second number");
        Scanner in = new Scanner(System.in);
        second_no = in.nextDouble();
    }

    public double addition() {
        return (first_no + second_no);
    }

    public double substract() {
        return (first_no - second_no);
    }

    public double multiply() {
        return (first_no * second_no);
    }

    public double division() {
        return (first_no / second_no);
    }

    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {

        SimpleCalculator obj = new SimpleCalculator();
        obj.getFirstNo();
        obj.getSecondNo();
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" 1.Addition\n 2.Substaction\n 3.Multiplication\n 4.Division\n 5.Factorial");
            System.out.println("Enter the choice");

            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Result is :" + obj.addition());
                    break;

                case 2:
                    System.out.println("Result is :" + obj.substract());
                    break;

                case 3:
                    System.out.println("Result is :" + obj.multiply());
                    break;

                case 4:
                    System.out.println("Result is :" + obj.division());
                    break;

                case 5:

            }

            System.out.println("Enter the no :");
            int no = in.nextInt();
            System.out.println("Result is :" + obj.factorial(no));
            break;

            // System.out.println("Do U want to continue 1 or 0?");
            // choice=in.nextInt();
        } while (choice < 6);
    }

}
