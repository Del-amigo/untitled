package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class topping3 {
    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key "potato"
    has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the
    value for the key "spinach".

topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup",
"fries": "ketchup"}
     */
    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<>();
        name.put("potato","ketchup");
//        name.put("potato","butter");
//        name.put("salad","oil");
//        name.put("potato","ketchup");
        System.out.println(topping3(name));
    }
    public static Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.get("potato");
            map.put("fries",map.get("potato"));
        }if(map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
return map;
    }
}
