package Day35.CreatingDates;

import java.time.LocalTime;

public class JavaLocalTime {
    //LocalTime - Contains just a time, no date and no time zone. (midnight, ts.morning class start time -> 9:00am)

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime of = LocalTime.of( 22, 24, 30 );
        int nano = localTime.getNano();
        System.out.println(nano);
        System.out.println(localTime);

        //       YAGNI = You aren't gonna need it
    }
}
