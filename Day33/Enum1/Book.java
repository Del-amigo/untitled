package Day33.Enum1;

public class Book {
public String name;
public BookCategory bookCategory;

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Books" +
                "name='" + name + '\'' +
                ", bookCategory=" + bookCategory;
    }
}
