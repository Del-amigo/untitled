package CodeWars;

public class OppositeNumber {
    /*
    Very simple, given a number, find its opposite.

Examples:

1: -1
14: -14
-34: 34
     */
    public static int opposite(int number){
        return number*(-1);
    }

    public static void main(String[] args) {
        System.out.println(opposite( 1 ));
    }
}
