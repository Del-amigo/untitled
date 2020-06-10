package CodingBat;

public class lastChars {
    /*    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo"
        and "java" yields "ya". If either string is length 0, use '@' for its missing char.

        lastChars("last", "chars") → "ls"
        lastChars("yo", "java") → "ya"
        lastChars("hi", "") → "h@"  */
    public static void main(String[] args) {
        String a = "last";
        String b = "chars";
        if(a.length()==0 && b.length()==0) {
            System.out.println("@" + "@");
        }else if (b.length()==0){
            System.out.println(a.substring(0,1)+"@");
        }else if (a.length()==0){
            System.out.println("@"+b.substring(b.length()-1));
        }
        String str = a.substring(0, 1).concat(b.substring(b.length() - 1));
        System.out.println(str);
    }
}
