package Day14;

import java.util.Scanner;

public class Task4 {
    // Determine and print the number of times
    // the character ‘a’ appears in the input entered by the user.

    // input: Test output
    //        a: 0

    // input: Ola amigo
    //        a:2
    public static void main(String[] args) {
        System.out.println( "Provide a text: " );
        Scanner input = new Scanner(System.in);
    String text = input.nextLine();

    int counterA = 0;
        for(int i = 0; i < text.length(); i++) {
        char letter = text.charAt( i );

        if(letter == 'a') {
            System.out.println( letter );
            counterA++;
        }else {
            System.out.println("There is no any");
        }
    }

        System.out.println( "‘a’ appears in the input: " + counterA + " times" );

}

}
