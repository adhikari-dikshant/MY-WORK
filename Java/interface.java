interface area {
    double calc(double x, double y);
}

class rect implements area {
    public double calc(double x, double y) {
        return (x * y);
    }
}

class Test {
    public static void main(String arg[]) {
        rect r = new rect();
        area a;
        a = r;
        System.out.println("\nArea of Rectangle is : " + a.calc(10, 20));
    }
}