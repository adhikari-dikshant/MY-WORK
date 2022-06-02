package UDEMY.module3;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int numberCopy = number;
            int remainder = 0; 
            int sum = 0;
            while (numberCopy > 0) {
                remainder = numberCopy % 10;
                if (remainder % 2 == 0) {
                    sum = sum + remainder;
                }
                numberCopy /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("sum is: " + getEvenDigitSum(123456780));
    }
}
