package Day37.CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcept {
    public static void main(String[] args) {
     //   File file = new File( "Example.txt" );

        // Checked/predicted/Excpected--(exception)--must be used with try catch, couse we R waiting for a exception
        try {
            FileInputStream fis = new FileInputStream( "Example.txt" );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
