package UDEMY.module2;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        if ((int) (n1 * 1000) == (int) (n2 * 1000)) {
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.195, 3.175);
    }
}
