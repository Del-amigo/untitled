package CodingBat;

public class seeColor {

/*    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.

        seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"   */
public static void main(String[] args) {
    String str = "xxred";
    if (str.startsWith("red")){
        System.out.println("red");
    }else if (str.startsWith("blue")){
        System.out.println("blue");
    }else{
        System.out.println("");
    }





}
}
