package Day44.Little_Task;

public class CrimeAndPunishment extends Book {
    public CrimeAndPunishment(String name, int page, String genre) {
        super( name, page, genre );
    }

    public static void main(String[] args) {
        Book book = new Book( "Harry Potter", 589, "Fantasy" );
        book.toString();
    }
}
