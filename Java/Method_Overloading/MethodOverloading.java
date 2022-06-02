package Method_Overloading;

class methodOv {

    // this method accepts int
    public void display(int a) {
        System.out.println("Got Integer data of methodOv.");
    }

    // this method accepts String object
    public void display(String a) {
        System.out.println("Got String object methodOv.");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        methodOv m1 = new methodOv();
        m1.display(1);
        m1.display("Hello");
    }
}
