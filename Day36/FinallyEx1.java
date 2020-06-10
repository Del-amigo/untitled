package Day36;

import java.time.LocalDate;
import java.time.Month;

public class FinallyEx1 {
    public static void main(String[] args) {
        try {
            LocalDate date = LocalDate.of( 2018, Month.APRIL, 40 );
        } catch (Exception exception) {
            System.out.println(exception.getMessage()); ///****
            System.out.println( "plese, provide correct date" );
        }
    }
}
