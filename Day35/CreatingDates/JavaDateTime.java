package Day35.CreatingDates;

import java.time.LocalDate;
import java.time.Month;

public class JavaDateTime {
    public static void main(String[] args){
    // LocalDate - Contains just a date, no time and no time zone. (19/12/1989, birthday this year)

       LocalDate localDate = LocalDate.now();
//        int dayOfMonth = localDate.getDayOfMonth();
//        int dayOfYear = localDate.getDayOfYear();
//        System.out.println(dayOfYear);
  //     print( checkAge( String.valueOf( 02/20/2000 ) ) );
        LocalDate localDate1 = LocalDate.of( 2021, Month.APRIL, 25 );//public static Access Modifiers
        System.out.println(localDate1);
    }

 static int checkAge(String dateOfBirth){
     LocalDate localDate = LocalDate.now();
     return localDate.getDayOfMonth();
   }
   public static void print (int dateOfBirth){
       System.out.println(checkAge( String.valueOf( dateOfBirth ) ));
   }
}
