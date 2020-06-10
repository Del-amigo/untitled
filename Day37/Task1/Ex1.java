package Day37.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Provide any date, please -- Year/Month/Day" );
        try {
            String input = scanner.nextLine();
            LocalDate date = LocalDate.parse( input, DateTimeFormatter.ofPattern( "yyyy/M/dd" ) );
            System.out.println( date );
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            System.out.println("Please, provide with numbers as a below");
        }
        System.out.println("U R Good");
    }
}
