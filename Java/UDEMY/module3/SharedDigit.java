package UDEMY.module3;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a> 99 || b < 10 || b > 99) {
            return false;
        }else{
            int num1Start = a % 10;
            int num1end = a / 10;
            int num2Start = b % 10;
            int num2end = b / 10;
            if (num1Start == num2Start || num1end == num2end || num1Start == num2end || num2Start == num1end || num1Start == num1end || num2Start == num2end) {
                return true;
            }else{
                return false;
            }
        }
    }
}
