package UDEMY.module2;

public class methods {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelDone = 5;
        int bonus = 800;
        int highScore = calculateScore(gameOver, score, levelDone, bonus);
        System.out.println("your score is " + highScore);

        score = 10000;
        levelDone = 8;
        bonus = 800;
        highScore = calculateScore(gameOver, score, levelDone, bonus);
        System.out.println("your score is " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelDone, int bonus) {
        if (gameOver) {
            int total = score + (levelDone * bonus);
            // System.out.println("your score is " + total);
            return total;
        }else{
            return -1;
        }
    }
}
