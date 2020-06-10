package CodingBat;

public class mixStart {
    /*
    Return true if the given string begins with "mix", except the 'm' can be
    anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */
    public static void main(String[] args) {
        System.out.println(mixStart("mix scacks"));
        System.out.println(mixStart("pix scacks"));
        System.out.println(mixStart("piz scacks"));
    }
    public static boolean mixStart(String str) {
        return str.length()>=3 && str.substring(1, 3).equals("ix");
    }

}
