package Day36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.println("Provide any date, please -- Year/Month/Day");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse( input, DateTimeFormatter.ofPattern( "yyyy/M/dd" ) );
        System.out.println(date);
    }
}
