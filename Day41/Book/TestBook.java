package Day41.Book;


import org.junit.Assert;
import org.junit.Test;

public class TestBook {
    @Test
    public void testBook_Success() {
        Book book = new Book();
        book.setName( "Life of QA" );
        book.setAuthor( "Jumaev Behruz" );
        book.setLeatherBoundPrice( 100d );
        book.setHardCoverPrice( 80.0 );
        book.setAudioBookPrice( 0D );
        boolean threePrices = book.hastThreePrices();

        Assert.assertTrue( threePrices );
    }
@Test
    public void testBook_Fail() {
        Book book = new Book();
        book.setName( "Life of QA" );
        book.setAuthor( "Jumaev Behruz" );
        book.setLeatherBoundPrice( 100d );
        boolean threePrices = book.hastThreePrices();

        Assert.assertFalse( threePrices );
    }
}

