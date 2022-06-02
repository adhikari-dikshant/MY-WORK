public class error {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c= 5;
        int x, y;
        try {
            x = a/(b-c);
        } catch (ArithmeticException e) {
            System.out.println("DIVISION BY ZERO");
        }
        y = a/(b+c);
        System.out.println("y = "+y);
    }
}
