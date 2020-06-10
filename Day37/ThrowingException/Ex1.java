package Day37.ThrowingException;

public class Ex1 {
    public static void main(String[] args) {
        int age = 15;

        if (age< 20){
      //      System.out.println("Your age is not valid");
            RuntimeException notValid = new RuntimeException( "Age is not valid " );
            throw notValid;
        }else {
            System.out.println("Welcome to app");
        }
    }
}
