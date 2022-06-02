package UDEMY.module3;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5)  {
            System.out.println("Invalid value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if ((i == 1) || (i == number) || (j == 1) || (j== number) || (i == j) || (i + j == number + 1) ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
    }
}
