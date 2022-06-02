package fact;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        int no, fact=1;
        Scanner s =new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER: ");
        no=s.nextInt();
        System.out.println("NUMBER IS: "+no);
        for(int i=1; i<=no; i++)
        {
            fact=fact*i;
        }
        System.out.println("FACTORIAL IS: "+fact);
    }
}