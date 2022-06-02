package UDEMY.module2;

public class ifElseCodeblocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelDone = 5;
        int bonus = 100;

        int newScore = 5000;
        int levelDoneNew = 8;
        int bonusNew = 200;

        // if (score < 5000 && score >1000) {
        //     System.out.println("your score is 5000");
        // }else if (score<1000){
        //     System.out.println("loser again");
        // }
        // else{
        //     System.out.println("looser");
        // }

        if (gameOver == true) {
            int total = score + (levelDone *bonus);
            System.out.println("your score is " + total);
        }

        if (gameOver == true) {
            int totalNew = newScore + (levelDoneNew *bonusNew);
            System.out.println("your score is " + totalNew);
        }
    }
}
