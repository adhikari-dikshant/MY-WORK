import java.util.Scanner;
public class time_conversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String time = s.next();
        String listTime[] = time.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String secounds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if (caser.equals("AM")) {
            if (hour.equals("12"))
                hour = "00";

            System.out.println(hour + ":" + minutes + ":" + secounds);
        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            System.out.println(hour + ":" + minutes + ":" + secounds);
        }

    }
}
