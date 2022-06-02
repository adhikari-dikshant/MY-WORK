package UDEMY.module1;

public class challenge1 {
    public static void main(String[] args) {
        byte a = 123;
        short b = 3467;
        int c = 45288;
        long d = (5000 + (10 * (a + b + c)));
        System.out.println(d);
        short totalShort = (short) (1000 + 10 * (a + b + c));
    }
}
