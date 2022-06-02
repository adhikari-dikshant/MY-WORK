package UDEMY.module1;

public class ifThen {
    public static void main(String[] args) {
        int topScore = 1000;
        if (topScore <= 1000) {
            System.out.println("you not got high score");
        }

        int topScore2 = 600;
        if ((topScore > topScore2) && (topScore <1000)) {
            //then
            System.out.println("lorem ipsum");
        }
        if ((topScore > 900) || (topScore2 <= 900)) {
            //then
            System.out.println("lorem ipsum dolor bhag");
        }
    }
}
