package HomeworksRepl.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class methodsix {
    /*
   create one method which is EvenOddNums
this method will accept one parameter which is String
In this String there will be 10 digit numbers like 1234567890
Take the each digit from the number and if the digit is an even add the digits,
if the digit is an odd subtract the digits.
Print the total.
Hint: You need to convert your digits from string to integer
For example
String is "6678421312"
6+6-7+8+4+2-1-3-1+2
result should be 16
     */
    public static void main(String[] args) {
        String a = "6678421312";
        System.out.println(EvenOddNums(a));
    }

    public static int EvenOddNums(String a) {
        int total = 0;
        for (int i = 0; i < a.length(); i++) {
        String characters = Character.toString(a.charAt(i));
        int temp = Integer.parseInt(characters);
        if (temp%2==0){
            total+=temp;
        }else {
            total-=temp;
        }
        }
        return total;
    }

    }
