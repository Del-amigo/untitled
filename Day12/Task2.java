package Day12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
    // given day in text provide its number

    "Monday" = > 1
    "Tuesday" => 2

     */
        Scanner scanner = new Scanner( System.in );
        String weekDay = scanner.nextLine();

        switch(weekDay) {
            case "Monday":
                System.out.println( "Day number is " + 1 );
                break;
            case "Tuesday":
                System.out.println( "Day number is " + 2 );
                break;
            case "Wednesday":
                System.out.println( "Day number is " + 3 );
                break;
            case "Thursday":
                System.out.println( "Day number is " + 4 );
                break;
            case "Friday":
                System.out.println( "Day number is " + 5 );
                break;
            case "Saturday":
                System.out.println( "Day number is " + 6 );
                break;
            case "Sunday":
                System.out.println( "Day number is " + 7 );
                break;
            default:
                System.out.println("it is different day :/");
        }

    }

}
