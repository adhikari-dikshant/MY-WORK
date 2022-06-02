package Avg;
import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        int n;
        int num;
        int sum=0;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER HOW MANY NUMBERS FOR FINDING AVERAGE");
        n = input.nextInt();
        System.out.println("ENTER NUMBERS TO FIND AVERAGE");
        for(i=1; i<=n; i++)
        {
            num = input.nextInt();
            sum+=num;
        }
        double avg = (double)sum/n;
        System.out.println("THE AVERAGE OF "+n+" IS: "+avg);
    }
}