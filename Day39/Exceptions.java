package Day39;

public class Exceptions {
    public static void main(String[] args) {

        String[] pets = {"dog", "cat", "monkey"};
        try {
            System.out.println( pets[3] );
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException.getMessage());
            System.out.println("You dont have that index from array");
        }
    }
}
