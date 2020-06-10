package ReplitCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    /*
    Create one method returnKey()
parameter is one String - Integer HashMap
return type is ArrayList
create one String - Integer HashMap.
    Map is "Lion",      1
           "Tiger",     2
           "Elephant",  3
           "Cat",       4
           "Dog",       5
return all the KEYS in the for loop
     */
    public static ArrayList<String> returnKey(HashMap<String, Integer> map) {
        ArrayList<String> key = new ArrayList<>();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
                key.add(entry.getKey());
        }
            return key;
    }




}
