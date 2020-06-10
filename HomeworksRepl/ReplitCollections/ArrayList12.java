package ReplitCollections;

import java.util.ArrayList;

public class ArrayList12 {
    /*
count how many values arraylist has between the two int
return the count

Example:
ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
min = 20
max = 30
return is 5
min and max range is included
     */
    public static int rangeBtw(ArrayList<Integer> list, int min, int max){
    int count = 0;
        /*
            for (int i = 0; i < list.size(); i++) {
                if ( list.get(i)>=min && list.get(i)<=max ) count++;
            }
        */
        for (Integer integer : list) {
            if( integer >= min && integer <= max ) count++;
        }
    return count;
    }

}
