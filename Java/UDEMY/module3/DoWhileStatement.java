package UDEMY.module3;

public class DoWhileStatement {
    public static void main(String[] args) {
        // int n = 1;
        // while (n != 6) {
        //     System.out.println("hjkjh" + n);
        //     n++;
        // }

        // FOR LOOP IS NOT IDENTICAL TO ABOVE WHILE LOOP
        // for (int i = 1; i < 7; i++) {
        //     System.out.println("hjkjh" + n);
        // }

        //THIS FOR LOOP IS IDENTICAL TO ABOVE WHILE LOOP
        // for (n = 1; n != 6; n++) {
        //     System.out.println("hjkjh" + n);
        // }

        int a = 4;
        int end = 20;
        int count = 0;
        while (a <= end) {
            a++;
            if (!isEvenNumber(a)) {
                continue;
            }
            System.out.println("even number: " + a);
            count++;
            {
                if (count > 5) {
                    break;
                }
            }
        }
        System.out.println("even numbers found: " + count);
    }
    
    public static boolean isEvenNumber(int a) {
        if ((a % 2) == 0) {
            return true;
        }else{
            return false;
        }
    }
}
