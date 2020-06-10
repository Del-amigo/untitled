package Day12;

import java.util.Random;

public class Task4 {
    // write a program that prints word representation of your number
    //      where number is between 0 and 5
    // ex: 0 => zero
    // ex: 3 => three

    //part 2: do the opposite
    // ex: zero => 0

    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt( 6 );
        System.out.println( "number is " + number );

        String numberRep = "";
        switch(number) {
            case 0:
                numberRep = "zero";
                //System.out.println( "zero" );
                break;
            case 1:
                numberRep = "one";
                break;
            case 2:
                numberRep = "two";
                break;
            case 3:
                numberRep = "three";
                break;
            default:
                System.out.println("Numberi otat? ");
        }

        System.out.println( numberRep );
    }

}
