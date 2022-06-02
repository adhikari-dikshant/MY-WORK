package Calci;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("CHOOSE AN OPERATOR: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("ENTER FIRST NUMBER: ");
        number1 = input.nextDouble();

        System.out.println("ENTER SECOND NUMBER: ");
        number2 = input.nextDouble();

        switch (operator) {
            case '+': // performs addition between numbers
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-': // performs subtraction between numbers
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*': // performs multiplication between numbers
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/': // performs division between numbers
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
