package Day13;

import java.util.Scanner;

public class Task4 {
    // write a program to check pin code
    // using do while loop
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int userPin = -1;
        int pinCode = 5555;
        do {
            if(userPin != -1) {
                System.out.println( "Incorrect pin" );
            }

            System.out.println( "Provide a pin code: " );
            userPin = input.nextInt();
        } while(userPin != pinCode);

        System.out.println( "Entered successfully" );

    }
}
