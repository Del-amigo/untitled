package ReplitCollections;

import java.util.ArrayList;

public class ArrayList1 {

    /*
    Create one method name is getCount()

Parameter is one String ArrayList , one String

return type is int.

Count how many times your parameter String occurs in the arraylist and return the count

For Example:
ArrayList is Orange , Kiwi , Peach , Banana , Orange

String is Orange

count should be 2
     */
        public static int getCount (ArrayList < String > list, String str){
            int c = 0;
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i))) c++;
            }
            return c;
        }

    }
