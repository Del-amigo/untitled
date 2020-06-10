package Day35.CreatingDates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.jar.JarOutputStream;

public class ExFormat {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL );//Short format
        System.out.println("Current date: "+ localDate.format( shortDateTime ));

//        if U want 2 change de order
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern( "yyyy MM dd" );
        String s = localDate.format( ofPattern );
        System.out.println(s);
    }
}
