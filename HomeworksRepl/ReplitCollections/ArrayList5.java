package ReplitCollections;

import java.util.ArrayList;

public class ArrayList5 {
    /*
    Create a method name is rotateList()
parameter is one String arrayList
rotate the arraylist
return the rotated String arraylist
 For example:
Arraylist =  "0New jersey" ,1"New york" , 2"Atlanta", 3"Florida" ,4"Ohio"
result should be 0"Ohio" , 1"Florida" ,2"Atlanta",3"New york" ,4"New jersey"  4 >=0 , 3>=1 2>=2 1>=3 0>=4
     */
    public static ArrayList<String> rotateList(ArrayList<String> list){
        ArrayList<String> rotatedList = new ArrayList<>(list.size());
        for (int i = list.size()-1; i>=0; i--) {
            list.set(i, list.get(list.size()-1 - i));
        }
        return rotatedList;
    }

}
