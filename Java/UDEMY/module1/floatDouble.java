package UDEMY.module1;

public class floatDouble {      
    // floats have decimals... is single primtive type i.e. 16 bit, doubles have ...is double primtive type i.e. 32 bit
    public static void main(String[] args) {
        float a = Float.MAX_VALUE;
        float b = Float.MIN_VALUE;
        System.out.println(a);
        System.out.println(b);

        double d = Double.MAX_VALUE;
        double c = Double.MIN_VALUE;
        System.out.println(c);
        System.out.println(d);


        int value1 = 6;
        float value2 = (float)5.78;   //f hatane se error aayega, ye batata he ki ye float he 
        double value3 = (double)4567;  
    }
}
