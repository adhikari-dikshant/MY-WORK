import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        long units;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF UNITS");
        units = s.nextLong();
        double billpay = 0;
        if (units<100) {
            billpay = units*1.20;
        }else if (units<300) {
            billpay = 100*1.2 + (units - 300)*3;
        }else if (units>300) {
            billpay = 100*1.20 + 200*2 + (units - 300)*3;
        }
        System.out.println("BILL TO PAY: " + billpay);
    }
}