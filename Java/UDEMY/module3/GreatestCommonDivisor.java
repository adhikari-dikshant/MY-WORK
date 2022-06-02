package UDEMY.module3;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 0 || second < 0) {
            return -1;
        }
        else{
            int i = Math.max(first, second);
            while (true) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
                i--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("divisor: " + getGreatestCommonDivisor(15, 25));
    }
}
