package UDEMY.module3;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int copy = number;
        int reverse = 0;
        int lastDigit = 0;

        while (copy > 0) {
            lastDigit = copy % 10;
            reverse = (reverse * 10) + lastDigit;
            copy /= 10;
        }

        if (number == reverse) {
            return true;
        }else{
            return false;
        }
    }
}
