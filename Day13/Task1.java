package Day13;

import java.util.Scanner;

public class Task1 {
    // write a java program which calculate sum from 50 to 100;
    public static void main(String[] args) {
 /*        int result = 0;

        int counter = 50;
        while(counter < 100) {
            System.out.println( "Num:" + counter );
            result += counter; //result = result + counter;

            counter++;
        }

        System.out.println( result );

**/
        Scanner result = new Scanner(System.in);
        System.out.println("Provide a number: ");
        int providedNumber = result.nextInt();

        int sum = 0;
        int i = 0;

        while(i <= providedNumber) {
            sum += i;
            System.out.println( "Adding: " + i );
            ++i;
        }

        System.out.println( "\nSum is: " + sum );

    }
}
