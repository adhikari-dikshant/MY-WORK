package UDEMY.module2;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                System.out.println(true);
                return true;
            }else{
                System.out.println(false);
                return false;
            }
        }else{
            if (temperature >= 25 && temperature <= 35) {
                System.out.println(true);
                return true;
            }else{
                System.out.println(false);
                return false;
            }
        }
    }

    public static void main(String[] args) {
        isCatPlaying(false, 45);
    }
}
