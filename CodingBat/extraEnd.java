package CodingBat;

public class extraEnd {
/*    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"  */
public static void main(String[] args) {
    String str = "Hello";
String lastchar=str.substring(str.length()-2);
    System.out.println(lastchar+lastchar+lastchar);
}
}