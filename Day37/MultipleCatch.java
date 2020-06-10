package Day37;

public class MultipleCatch {
    public static void main(String[] args) {
        String str = "";
        try {
            char firstLetter = str.charAt( 0 );
        }catch (Error nullPointerException){
            System.out.println("Str is "+ nullPointerException.getMessage());
        }catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println(stringIndexOutOfBoundsException.getMessage());
            System.out.println("Str is empty, no charactes in it");
        }catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
            System.out.println("Something went wrong...");
        }
    }
}
