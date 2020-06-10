package Day35;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of( 1993,1,14 );
        Period between = Period.between( localDate, birthdate );
        System.out.println(between);
    }

    @Test
    public void testDiference(){
        LocalDate localDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of( 1993,1,14 );
        Period between = Period.between( birthdate, localDate );
        Assert.assertEquals( 27, between.getYears());
        Assert.assertEquals( 4,between.getMonths() );
        Assert.assertEquals( 17,between.getDays() );
   }
}
