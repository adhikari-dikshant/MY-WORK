import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i, count;
        System.out.print("ENTER N VALUE : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("PRIME NUMBERS BETWEEN 1 TO " + n + " ARE ");
        for (int j = 2; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + "  ");
        }
    }
}
