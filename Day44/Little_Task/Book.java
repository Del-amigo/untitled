package Day44.Little_Task;

public class Book {
    public String name;
    public int page;
    public String genre;

    public Book (String name, int page, String genre){
        this.name = name;
        this.page = page;
        this.genre = genre;
    }

    public String toString(){
        System.out.println("Name of the book is "+name );
        System.out.println("Totally the book is "+ page+" pages");
        System.out.println("The genre of book is "+genre);
        return null;
    }

}
