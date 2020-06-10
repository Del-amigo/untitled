package Day45.Static_Block;

public class My_Class {
    {
        System.out.println("Initializer Block");
    }
   public My_Class(){
       System.out.println("Constructor");
   }
    public static void main(String[] args) {
        System.out.println("Main");
        new My_Class();
    }
}
