package CodeWars;

public class ReversedStrings {
    /*
    Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
     */
    public static void main(String[] args) {
        System.out.println(solution( "world" ));
    }
    public static String solution(String str) {
        // Your code here...          //    return new StringBuilder(str).reverse().toString();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder builder = stringBuilder.append( str );
        StringBuilder reverse = builder.reverse();
        return reverse.toString();
    }
}
