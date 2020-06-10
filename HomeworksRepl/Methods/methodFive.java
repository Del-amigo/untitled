package HomeworksRepl.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class methodFive {
    /*
    Create one method name is getSum
This method has one parameter which is String ArrayList
Remove all the $ signs in the arraylist and sum all the numbers
return the total return type should be int
if the result less then 0 then print -1

Example :
ArrayList is : $13 , $15 , $20
result should be 48

Example 2:
ArrayList is : $-13 , $0 , $0
result should be -1
Note: add the imports if need to.

     */
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        num.add("$-13");
        num.add("$8");
        num.add("$8");
        System.out.println(getSum(num));
    }

    public static int getSum(ArrayList<String> dollar) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < dollar.size(); i++){
            String newStr = dollar.get(i).replace("$", "");
            int anyName = Integer.valueOf(newStr);
            num.add(anyName);
        }
    int total = 0;
        for (int i = 0; i < num.size(); i++) {
            total=num.get(i)+total;
        }
        if (total>=0){
            return total;
        }return -1;
    }
    }
