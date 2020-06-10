package ReplitCollections;

import java.util.HashMap;
import java.util.Map;

public class Map4 {
    /*
    Create a method name is update()
parameter is one Integer - String HashMap , one int , one String
return type is Integer - String map
if map  contains the parameter int
then  update the value of the int to parameter String
Example :
 map is
1, "New jersey"
2, "New York"
3, "London"
4, "Paris"
int is 3
String is Miami
result should be
1, "New jersey"
2, "New York"
3, "Miami"
4, "Paris"
     */
    public static HashMap<Integer,String> update(HashMap<Integer,String> myMap, int i, String city){
        HashMap<Integer,String> result = new HashMap<>(myMap);
            if ( result.containsKey(i)){
                result.replace(i, city);
            }
            return result;
    }
}
