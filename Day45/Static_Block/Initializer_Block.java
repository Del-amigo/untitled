package Day45.Static_Block;

public class Initializer_Block {
    {
        System.out.println("Initializer_Block");
    }
   public Initializer_Block(){
       System.out.println("Constructor");
   }

    public static void main(String[] args) {
        System.out.println("Main");
        new Initializer_Block();
    }
    {
        System.out.println("Initializer_Block 2");
    }
}
