package Day30;

public class Book {
    String name;
    int publishYear;

    public void print(){
        System.out.println("Name: "+this.name);  //we need "This" for diffrentiate which variable, just assign
        System.out.println("Year: "+ publishYear);
    }
}

class Ex{
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Harry Potter";
        book1.publishYear = 2001;
        book1.print();
    }
}
