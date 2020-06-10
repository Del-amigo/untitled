package ReplitCollections;

import java.util.ArrayList;

public class ArrayList2 {
    /*
    Create a method name is getSum()

Parameter is ArrayList

Return type is int

Add all the numbers in the ArrayList

Return the addition result

For Example:

Arraylist is 1,2,3,4,5

return should be 15
     */
    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int myNum:list) {
            sum += myNum;
        }
        return sum;
    }
}
