package UDEMY.module3;

public class switchStatement {
    public static void main(String[] args) {
        char switchValue = 'A';
        switch (switchValue) {
            case 'A':
                System.out.println("value of A");
                break;

            case 'B':
                System.out.println("value of B");
                break;

            case 'C', 'D', 'E':
                System.out.println("value of " + switchValue);
                break;

            default:
                System.out.println("NOTA");
                break;
        }
    }
}
