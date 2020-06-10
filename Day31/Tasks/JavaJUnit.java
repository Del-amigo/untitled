package Day31.Tasks;

import Day31.Tasks.PostalService;
import org.junit.Assert;
import org.junit.Test;

public class JavaJUnit {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {  //U'LL use void, couse U dont need to return anything***
        int sum = 15 + 30;

        Assert.assertEquals( "There is mistake at sum", 45, sum );
    }

    @Test
    public void test2() {
        boolean actual = "Elma is good".contains( "Elma" ); //(true && true) || (false && true);

        Assert.assertTrue( actual );
//        Assert.assertEquals(true, actual);
    }

    @Test
    public void Test3() {
        String a1 = "https://www.etsy.com/cart?ref=hdr-cart";
        String a2 = "cart123";

        Assert.assertFalse( "A1 should contain A2", a1.contains( a2 ) );
    }

}


