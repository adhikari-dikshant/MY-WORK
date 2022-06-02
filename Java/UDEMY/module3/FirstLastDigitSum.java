package UDEMY.module3;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int num = number;
        if (number < 0) {
            return -1;
        }else{
            int digStart = 0;
            int digEnd = 0;
            int count = 0;
            digEnd = number % 10;
            while (num > 0) {
                num /= 10;
                count++;
            }
            digStart = (int) (number / (Math.pow(10, count - 1)));
            return digEnd + digStart;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(678));
    }
}
