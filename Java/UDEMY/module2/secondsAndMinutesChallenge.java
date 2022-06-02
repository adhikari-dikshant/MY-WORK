package UDEMY.module2;

public class secondsAndMinutesChallenge {

    public static int getDurationString(int min, int sec) {
        if (min >= 0 && 0 <= sec && sec <= 59) {
            int hrs = min / 60;
            int remainingMin = min % 60;
            System.out.println(hrs + " hr " + remainingMin + " min " + sec + " sec");
            return 1;
        }else{
            System.out.println("Invalid Parameters");
            return -1;
        }
    }

    public static int getDurationString(int sec){
        if (sec >= 0) {
            int min = sec / 60; 
            int remainingSec = sec % 60;
            return getDurationString(min, remainingSec);
        }else{
            System.out.println("Invalid sec Parameter");
            return -1;
        }
    }

    public static void main(String[] args) {
        getDurationString(67, 50);
        getDurationString(9087);
    }
}
