package UDEMY.module3;

public class LastDigitChecker {
    public static boolean isValid(int n) {
        if (n < 10 || n > 1000) {
            return false;
        }else{
            return true;
        }
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }else{
            int num1end = a % 10;
            int num2end = b % 10;
            int num3end = c % 10;
            if (num1end == num2end) {
                return true;
            }else if (num2end == num3end) {
                return true;
            }else if (num3end == num1end) {
                return true;
            }else{
                return false;
            }
        }
    }
}
