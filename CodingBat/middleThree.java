package CodingBat;

public class middleThree {
/*    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"   */
public static void main(String[] args) {
    String str = "and";
int length = str.length()/2;
    System.out.println(str.substring(length-1,length+2));
}
}
