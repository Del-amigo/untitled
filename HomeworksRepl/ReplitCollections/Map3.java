package ReplitCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {
    /*
    Create one method returnValue()

parameter is one String - Integer HashMap
return type is ArrayList

create one String , Integer HashMap.

  Map is  1 ,  "Lion"
     2 ,  "Tiger"
     3 ,  "Elephant"
     4 ,  "Cat"
     5  , "Dog"

return all the VALUES in the for loop
     */
    public static ArrayList<Integer> returnValue(HashMap<String, Integer> map){
        ArrayList<Integer> value = new ArrayList<>();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            value.add(entry.getValue());

        }
        return value;
    }
}
