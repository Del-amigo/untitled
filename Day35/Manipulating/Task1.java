package Day35.Manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class Task1 {
    @Test
    public void testPlusMinuteAndHour(){
        LocalTime localTime = LocalTime.of(10,00);
        LocalTime actual = localTime.plusHours(2).plusMinutes(30);

        Assert.assertEquals(12, actual.getHour());
        Assert.assertEquals(30, actual.getMinute());
    }

    @Test
    public void testMinusMinuteAndHour(){
        LocalTime localTime = LocalTime.of(10,00);
        LocalTime actual = localTime.minusHours(2).minusMinutes(30);

        //10:00 - 2:30 -> 7:30

        Assert.assertEquals(7, actual.getHour());
        Assert.assertEquals(30, actual.getMinute());
    }
}
