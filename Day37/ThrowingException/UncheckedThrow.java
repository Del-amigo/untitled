package Day37.ThrowingException;

public class UncheckedThrow {
    public static void main(String[] args) {
          checkUserName( null );

        System.out.println("You have sihjned Up. congratulation");
    }
    public static void checkUserName(String username){
        if(username == null){
            throw new NullPointerException("Username might not been initialized, please write anithing");
        }
        if (username.length()<6){
            throw new RuntimeException("Usernam's length must be more then 6 letters...");
        }
    }
}
