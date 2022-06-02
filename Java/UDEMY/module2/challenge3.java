package UDEMY.module2;

public class challenge3 {
    public static void main(String[] args) {
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Dikshant", highScore);

        highScore = calculateHighScorePosition(800);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(89);
        displayHighScorePosition("Nigga Asshole", highScore);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Hello " + name + ", you are in " + position + " position on score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1; 
        }else if (score >= 500) {
            return 2;
        }else if (score >= 100) {
            return 3;
        }else {
            return 4; 
        }
    }
}
