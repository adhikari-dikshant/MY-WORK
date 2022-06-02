package UDEMY.module2;

public class EqualSumChecker {
    public static boolean hasEqualSum(int n1, int n2, int n3) {
        if (n1 + n2 == n3) {
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }
}
