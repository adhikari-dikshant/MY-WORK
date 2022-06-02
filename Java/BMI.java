import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        calculateBMI();
    }
    private static void calculateBMI() {
        System.out.print("PLEASE ENTER YOUR WEIGHT IN KGs: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("PLEASE ENTER YOUR HEIGHT IN CMs: ");
        float height = s.nextFloat();
        float bmi = (100*100*weight)/(height*height);
        System.out.println("YOUR BMI IS: "+bmi);
        printBMIcategory(bmi);
    }
    private static void printBMIcategory(float bmi) {
        if (bmi < 18.5) {
            System.out.println("YOU ARE UNDERWEIGHT");
        }
        else if (bmi < 25) {
            System.out.println("YOU ARE NORMAL");
        }
        else if (bmi < 30) {
            System.out.println("YOU ARE OVERWEIGHT");
        }
        else {
            System.out.println("YOU ARE OBESE");
        }
    }
}