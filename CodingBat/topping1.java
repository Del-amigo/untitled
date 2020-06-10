package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class topping1 {
    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream"
    is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */
    public static void main(String[] args) {
        HashMap<String,String> name = new HashMap<>();
    //    name.put("ice cream", "peanuts");
 //   name.put("","");
        name.put("pancake","syrup");
        System.out.println(topping1(name));
    }
    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
return map;
    }

}
