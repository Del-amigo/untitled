package ReplitCollections;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ArrayList8 {
    /*
     create a method name is secondMax()  ok
parameter is integer ArrayList ok
return type is int ok
find the second max from the arraylist and return it
for example:
ArrayList is 5,3,4,6,7
result should be 6
     */
    public static int secondMax (ArrayList<Integer> list){
        sort(list);
        int secondMax = list.size()-2;

        return list.get(secondMax);
    }
}
