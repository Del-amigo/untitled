package CodingBat;

public class left2 {
    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
     */
    public static void main(String[] args) {
       String str="java";
       String str1=str.substring(2).concat(str.substring(0,2));
        System.out.println(str1);
    }
}
