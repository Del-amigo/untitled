package Day12;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
    //with random     01234
    String results = "ABCDF#";
    Random rand = new Random();
    char letter = results.charAt( rand.nextInt( 6 ) );

        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
    String examResult = letter + ""; //String.valueOf(  ); Character.toString(  );
        System.out.println(examResult);

        if(examResult.equals( "A" )) {
        System.out.println( "Excellent!!!" );
    } else if(examResult.equals( "B" )) {
        System.out.println( "Well done" );
    } else if(examResult.equals( "C" )) {
        System.out.println( "Good" );
    } else if(examResult.equals( "D" )) {
        System.out.println( "Need improvement" );
    } else if(examResult.equals( "F" )) {
        System.out.println( "Fail" );
    } else {
        System.out.println( "Not valid input!!!" );
    }
}
}
