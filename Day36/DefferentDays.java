package Day36;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class DefferentDays {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of( 2020,1,1 );
        LocalDate d2 = LocalDate.of( 2020,1,15 );
        System.out.println(differen_Days( d1,d2));
    }
    public static Period differen_Days(LocalDate date1, LocalDate date2){
         return Period.between( date1,date2 );
    }

    @Test
    public void testDifference(){
        LocalDate d1 = LocalDate.of( 2020,1,1 );
        LocalDate d2 = LocalDate.of( 2020,1,15 );
        Period differenDays = differen_Days( d1, d2 );
        Assert.assertEquals( 14,differenDays.getDays() );
    }
}
