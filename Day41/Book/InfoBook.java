package Day41.Book;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class InfoBook {
    public ArrayList<Book> getClassicBooks() {
        ArrayList<Book> books = new ArrayList<>();
        LocalDate localDate1 = LocalDate.of( 2011, Month.NOVEMBER, 1 );
        LocalDate localDate2 = LocalDate.of( 2015, 11, 24 );
        LocalDate localDate3 = LocalDate.of( 2004, Month.AUGUST, 28 );
        Book book = new Book( "Mark Twain: Five Novels (Leather-bound Classics)",
                "Mark Twain and Elizabeth Boyle Machlan PhD", localDate1,
                16.69, 10.49, 0.00 );
        Book book1 = new Book( "Jane Austen: The Complete Works 7-Book Boxed Set: Classics hardcover boxed " +
                "set (Penguin Clothbound Classics)", " Austen and Coralie Bickford-Smith",
                localDate2, null, 109.61, null );
        Book book2 = new Book( "Little Women (Puffin in Bloom)", "Louisa May Alcott",
                localDate3, null, 11.99, 0.00 );
        books.add( book );
        books.add( book1 );
        books.add( book2 );
        return books;
    }

    public static void main(String[] args) {
    InfoBook infoBook = new InfoBook();
   ArrayList<Book> classicBook = infoBook.getClassicBooks();
        for (Book book : classicBook) {
            System.out.println(book);
        }
    }
}
