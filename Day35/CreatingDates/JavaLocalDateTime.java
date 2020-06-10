package Day35.CreatingDates;
import java.time.LocalDateTime;

public class JavaLocalDateTime {
    // LocalDateTime - Contains both a date and time but no time zone.00:00 01/01/2021 new year, 20:10 05/11/2020 iftar)
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
      //  System.out.println(localDateTime);
        LocalDateTime time = LocalDateTime.of( 2020, 05, 30, 18, 25, 59 );
        System.out.println(time);
    }
}
