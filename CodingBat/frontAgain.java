package CodingBat;

public class frontAgain {
    /*
    Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
     */
    public static void main(String[] args) {
        System.out.println(frontAgain("jjjk"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
        String example = "jjjk";
        System.out.println(example.substring(example.length()-2));

    }
    public static boolean frontAgain(String str) {
        return  str.length()==2 || str.length() >= 3 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }
}
