package Day12;

import java.util.Random;

public class JavaSwitchStatement {
    public static void main(String[] args) {
        Random random = new Random();
        int day = 1 + random.nextInt( 7 ); //0 - 7
//        int day = 1;
        System.out.println( "You day is: " + day );

        switch(day) {
            case 1: // if day == 1
                System.out.println( "Monday" );
                break;
            case 2:// if day == 2
                System.out.println( "Tuesday" );
                break;
            case 3:// if day == 3
                System.out.println( "Wednesday" );
                break;
            default:// else
                System.out.println( "not a valid day number" );
                break;

        }

    }
}
