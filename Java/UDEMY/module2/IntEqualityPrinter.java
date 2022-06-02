package UDEMY.module2;


public class IntEqualityPrinter {
    static final String PRINT = "Neither all are equal or different";
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        }else if (a == b) {
            System.out.println(PRINT);
        }else if (c == a) {
            System.out.println(PRINT);
        }else if (b == c) {
            System.out.println(PRINT);
        }else {
            System.out.println("All numbers are different");
        }
    }

    public static void main(String[] args) {
        printEqual(1, 2, 3);
    }
}