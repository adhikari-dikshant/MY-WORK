package UDEMY.module1;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int value = 10000;
        int minimumValue = Integer.MIN_VALUE;
        int maximumValue = Integer.MAX_VALUE;
        System.out.println("INTEGER MINIMUM VALUE: " + minimumValue);
        System.out.println("INTEGER MAXIMUM VALUE: " + maximumValue);
        System.out.println("BUSTED MAXIMUM VALUE: " + (maximumValue + 1));
        System.out.println("BUSTED MINIMUM VALUE: " + (minimumValue - 1));

        int value2 = 1234;
        byte minimumByteValue = Byte.MIN_VALUE;
        byte maximumByteValue = Byte.MAX_VALUE;
        System.out.println("BYTE MINIMUM VALUE: " + minimumByteValue);
        System.out.println("BYTE MAXIMUM VALUE: " + maximumByteValue);

        short minimumShortValue = Short.MIN_VALUE;
        short maximumShortValue = Short.MAX_VALUE;
        System.out.println("SHORT MINIMUM VALUE: " + minimumShortValue);
        System.out.println("SHORT MAXIMUM VALUE: " + maximumShortValue);

        long value3 = 1000000 ;
        long minimumLongValue = Long.MIN_VALUE;
        long maximumLongValue = Long.MAX_VALUE;
        System.out.println("LONG MINIMUM VALUE: " + minimumLongValue);
        System.out.println("LONG MAXIMUM VALUE: " + maximumLongValue);
    }
}
