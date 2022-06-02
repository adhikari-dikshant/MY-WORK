package UDEMY.module3;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }
        int reverseNumber = reverse(number);
        int numberDigitCount = getDigitCount(number);
        int reverseNumberDigitCount = getDigitCount(reverseNumber);
        String s = "";
        int remainder = 0;
        while (reverseNumber > 0) {
            remainder = reverseNumber % 10;
            switch (remainder) {
                case 0:
                    s = s + "Zero ";
                    break;
                case 1:
                    s = s + "One ";
                    break;
                case 2:
                    s = s + "Two ";
                    break;
                case 3:
                    s = s + "Three ";
                    break;
                case 4:
                    s = s + "Four ";
                    break;
                case 5:
                    s = s + "Five ";
                    break;
                case 6:
                    s = s + "Six ";
                    break;
                case 7:
                    s = s + "Seven ";
                    break;
                case 8:
                    s = s + "Eight ";
                    break;
                case 9:
                    s = s + "Nine ";
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }
        if (numberDigitCount > reverseNumberDigitCount) {
            for (int i = 0; i < (numberDigitCount - reverseNumberDigitCount); i++) {
                s = s + "Zero ";
            }

        }
        System.out.println(s);
    }

    public static int reverse(int number) {
        int remainder = 0;
        int reverse = 0;
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number = Math.abs(number);
        }
        while (number > 0) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number /= 10;
        }
        if (negative == true) {
            return -reverse;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int n = 0;
        while (number > 0) {
            number /= 10;
            n++;
        }
        return n;
    }
}
