package UDEMY.module1;

public class charBoolean {
    public static void main(String[] args) {
        char char1 = 'd';  
        // char occupies 2 bytes of memory, has width 16. the reason its not single byte allowsus to store unicode characters.
        char uniCode = '\u00A9';
        System.out.println(char1);
        System.out.println(uniCode);

        boolean bool1 = true;
        boolean bool2 = false; 
        boolean cOverAge = true; 
        // System.out.println();
    }
}
