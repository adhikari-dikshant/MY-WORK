package UDEMY.module2;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");;
        }
        else{
            int mb = kilobytes / 1024;
            int remaingKb = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + mb + " MB and " + remaingKb + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(890876);
    }
}
