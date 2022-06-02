package UDEMY.module3;

public class WhileStatement {
    public static void main(String[] args) {
        int n = 0;              // 1 init
        while (n < 15) {        // 2 condition
            n ++;               // 3 increment

            if (n <= 5) {       // after increment checks if n increses to 5
                System.out.println("lorem ipsum" + n); // if it is true, it executes the code to continue
                continue;       // starts looping
            }
            System.out.println("lorem ipsum dolor" + n); // n <= 5 comes false
            if (n >= 10) {
                System.out.println("LOREM IPSUM DOLOR" + n);
                break;
            }
        }
    }
}
