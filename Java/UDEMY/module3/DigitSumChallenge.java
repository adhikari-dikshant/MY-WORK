package UDEMY.module3;

public class DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        //125 / 10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5
        while (number > 0) {

            // extract least significant digit
            int dig = number % 10;
            sum += dig;

            // drop least significant digit
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits in 125 is: " + sumDigits(125));
    }
}
