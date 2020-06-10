package Tasks;

public class AlicesBookstore {

    // Java used in real life :)

    // Alice is opening a bookstore and wants to create a tracking system.
    // She will sell kids books, recipe books, novels and comics.
    // She has 10 of them each.
    // She wants to calculate how many books are left after each transaction.

    /**
     * task 1: create 4 static int variables for each book type and equal it to 10
     **/

    public static int kids = 10;
    public static int recipe = 10;
    public static int novels = 10;
    public static int comics = 10;

    public int allBooks = 40;

    /** task 2: create 4 methods named soldKids, soldRecipe, soldNovels, and soldComics.
     // for each method, have a parameter of int soldNum and subtract that number from the corresponding book count.
     // print "kids books left: ...", have void return type, have an int parameter as int soldNum **/

    public static void soldKids (int soldNum) {
        kids -= soldNum;
        System.out.println("kids books left : " + kids);
    }

    public static void soldRecipe (int soldNum) {
        recipe -= soldNum;
        System.out.println("recipe books left : " + recipe);
    }

    public static void soldNovels (int soldNum) {
        novels -= soldNum;
        System.out.println("novels books left : " + novels);
    }

    public static void soldComics (int soldNum) {
        comics -= soldNum;
        System.out.println("comics books left : " + comics);
    }


    /** go to AliceBookStoreTransaction class for task 3 and a bonus tasks **/

}
