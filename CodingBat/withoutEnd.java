package CodingBat;

public class withoutEnd {
    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell".
     The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
     */
    public static void main(String[] args) {
        String str = "coding";
        String st1 = str.substring(1,str.length()-1);
        System.out.println(st1);

    }
}
