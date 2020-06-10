package Day37.Task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Provide a number, please! " );
        try {
            String str = scanner.nextLine();
            int integer = converter( str );
            System.out.println( integer );
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            System.out.println("Arabic NUMBERS FROM 0 TO 9");
        }
    }

    public static int converter(String string){
        return Integer.parseInt( string );
    }
}
