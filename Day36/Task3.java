package Day36;


import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"Hi", "Hello", null, "Techno", "study"};
        for (String word : arr) {
            try {
                System.out.println( word.substring( word.length() - 1 ) );
            } catch (Exception exception) {
                System.out.println( "You have " + arr[2] + " in your array" );
            }
        }
    }
}

