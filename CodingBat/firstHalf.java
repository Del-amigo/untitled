package CodingBat;

public class firstHalf {
/*    Given a string of even length, return the first half.
    So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"    */
public static void main(String[] args) {
    String str = "HelloThere";
    if (str.length()/2==5){
        System.out.println(str.substring(0,5));
    }else if (str.length()/2==3){
        System.out.println(str.substring(0,3));
    }else if (str.length()/2==7){
        System.out.println(str.substring(0,7));
    }else if(str.length()/2==1){
        System.out.println(str.substring(0,1));
    }
}
}
