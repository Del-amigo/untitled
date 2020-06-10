package Day45.Static_Block;

public class Static_blocOrder {
    static {
        System.out.println("First");
    }
    static {
        System.out.println("second");
    }
    public static void main(String[] args) {

    }
    static {
        System.out.println("third");
    }

}
