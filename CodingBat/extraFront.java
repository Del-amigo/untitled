package CodingBat;

public class extraFront {
    /*
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
     */
    public static void main(String[] args) {
        System.out.println(extraFront(""));
    }

    public static String extraFront(String str) {
    if (str.length()>=2){
        return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    }else if (str.length()==1){
        return str.substring(0,1)+str.substring(0,1)+str.substring(0,1);
    }else if (str.length()<=0){
        return ""+""+"";
    }return str;
    }
}
