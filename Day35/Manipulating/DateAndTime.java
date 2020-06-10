package Day35.Manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateAndTime {
    @Test
    public void testProjectFate(){
        LocalDate localDate = LocalDate.now();
        LocalDate plusDays = localDate.plusDays( 6 );
        System.out.println(plusDays);

        Assert.assertEquals( 6, plusDays.getDayOfMonth() );
        Assert.assertEquals( DayOfWeek.SATURDAY, plusDays.getDayOfWeek() );
        Assert.assertEquals( Month.JUNE, plusDays.getMonth() );
        Assert.assertEquals( 2020,plusDays.getYear());
    }
}
