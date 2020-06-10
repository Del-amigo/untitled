package Tasks;

public class AlicesBookstoreTransaction {

    /** task 3: Jorge came to Alice's Bookstore and decided to buy
    // 1 kids books books, 2 novels and 5 comics
    // call the corresponding methods here to complete the transaction then run the class and see how many books are left **/

    public static void main(String[] args) {

    AlicesBookstore.soldKids(1); // call it with class name . name of the method
    AlicesBookstore.soldNovels(2);
    AlicesBookstore.soldComics(5);

//    AlicesBookstore a = new AlicesBookstore(); // obj
//        System.out.println(a.allBooks);
//        a.allBooks -= 5;
//        System.out.println(a.allBooks);
//
//        AlicesBookstore a2 = new AlicesBookstore();
//        System.out.println(a2.allBooks);

    }

    /** bonus task 1:
    // create a public static int as moneyEarned for Alice's Bookstore
    // sell:
    // kids books for $3, recipe books for $10, novels for $7.55, and comics for $4.99
    // print the total money earned in all of the soldBooks methods **/

    ////

    /** bonus task 2:
    // include if statements inside the methods.
    // if the book remaining is between 10 - 7 print "you are fine"
    // if the book remaining is between 7 - 4 print "state the book as best seller"
    // if the book remaining is between 4 - 1 print "order more"
    // if the book remaining is 0 and below then print "pre-sold... ship later" **/


}
