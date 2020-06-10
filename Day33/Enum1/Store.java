package Day33.Enum1;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
    Store store = new Store();
    store.printFantasyBooks();
    }

    public void printFantasyBooks() {
        ArrayList<Book> books = getbook();

        for (Book book : books) {
            if (book.bookCategory == BookCategory.FANTASY) {
                System.out.println( book );
            }
        }
    }
            public ArrayList<Book> getbook () {
                ArrayList<Book> list = new ArrayList<>();
                Book book6 = new Book( "Sherlock Holmes", BookCategory.DETECTIVE );
                Book potter = new Book( "Harry Potter", BookCategory.FANTASY );
                Book book1 = new Book( "To Kill Mockinbird", BookCategory.NOVEL );
                Book book2 = new Book( "Investing 101", BookCategory.ECONOMY );
                Book book3 = new Book( "Neuromancer", BookCategory.FICTION );
                Book book4 = new Book( "Leila Mecnun", BookCategory.CLASSIC );
                Book book5 = new Book( "The Witcher", BookCategory.FANTASY );

                list.add( book1 );
                list.add( book2 );
                list.add( book3 );
                list.add( book4 );
                list.add( book5 );
                list.add( book6 );
                list.add( potter );

                return list;
            }
        }