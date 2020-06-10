package Day45.Static_Block;

public class Application extends Content {
    public static String name;

    static {
   name = "MyApp";
        System.out.println("Static block");
    }
    public Application(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new Application();
    }
}
