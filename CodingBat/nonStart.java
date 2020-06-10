package CodingBat;

public class nonStart {
/*    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.

    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"  */
public static void main(String[] args) {
String a="Hello";
String b="There";
    System.out.println(a.substring(1).concat(b.substring(1)));

}
}
