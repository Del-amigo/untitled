package CodingBat;

public class backAround {
    /*
    Given a string, take the last char and return a new string with the last char added at the front
     and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */
    public static void main(String[] args) {
        System.out.println(backAround("Hello"));
    }
    public static String backAround(String str) {
        String a = str.substring(str.length()-1);
        String b = str.substring(0,1);
if(str.length()==1){
    return a+str+b;
}else if(str.length()>1){
    return a+str+a;
}
return a+b;
    }
}
