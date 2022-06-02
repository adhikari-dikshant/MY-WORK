package UDEMY.module1;

public class casting {   
    // casting means to treat or convert a number from one type to another
    public static void main(String[] args) {
        int a = 10000;
        int minimumValue = Integer.MIN_VALUE;
        int maximumValue = Integer.MAX_VALUE;
        int total = (minimumValue / 2);

        byte minimumByteValue = Byte.MIN_VALUE;
        byte maximumByteValue = Byte.MAX_VALUE;
        byte newByteValue = (byte) (minimumByteValue / 2);

        short minimumShortValue = Short.MIN_VALUE;
        short maximumShortValue = Short.MAX_VALUE;
        short newShortValue = (short) (minimumShortValue / 2);

        long minimumLongValue = Long.MIN_VALUE;
        long maximumLongValue = Long.MAX_VALUE;
        long newLongValue = (long) (minimumLongValue / 2);

        System.out.println(total + newByteValue + newLongValue + newShortValue);
    }
}
