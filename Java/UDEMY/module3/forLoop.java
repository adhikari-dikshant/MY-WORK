package UDEMY.module3;

public class forLoop {
    public static double calculateIntesrest(double amt, double intRate) {
        return (amt * (intRate / 100));
    }

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at " + i + "% interest is: " + calculateIntesrest(10000, i));
        }
        System.out.println("**********************************");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + "% interest is: " + calculateIntesrest(10000, i));
        }
    }
}
