package CodingBat;

public class lastTwo {
    /*
    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so
     "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
     */
    public static void main(String[] args) {
        String abcd= "ab";

        System.out.println(abcd.substring(abcd.length()-1)+abcd.substring(0,1));


        System.out.println(lastTwo("cat"));
    }

    public static String lastTwo(String str) {
String last = str.substring(str.length()-1);
        if (str.length() == 2) {
            return str.substring(str.length()-1)+str.substring(0,1);
        }else if(str.length()>=3){
            return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
        }
        return str;
    }

}
