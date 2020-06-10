package Day36;

public class JavaTryCatchFinally {
    public static void main(String[] args) {
        String str = null;
        try { // to test your statements
            char charAt = str.charAt( 0 );
            System.out.println("Try block");
        }catch (Exception exception){// is executed only when U have an exception
            System.out.println("Catch block");
      //      System.out.println("Your str variable might be null");
        }finally { // finaly block is executed no metter what !!!
            System.out.println("Finally block");
        }
        System.out.println("END OF CODE");
    }
}
