package Day31.ProtectedModifiers.Other;

public class Book {
//protected field/atribute
      protected String name;

    //protected constructor
    protected Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
//protected method
    protected void print(){
        System.out.println(toString());
    }
    private static boolean check(){
        return false;
    }
}
