package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapShare {
    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */
    public static void main(String[] args) {
        HashMap<String,String> share = new HashMap<>();
    //    share.put("a", "aaa");
        share.put("b","bbb");
        share.put("c","ccc");
        share.put("d","ddd");
        System.out.println(mapShare(share));
    }
    public static Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
       if(map.containsKey("a")){
           map.put("b", map.get("a"));
       }
        return map;
     }
    }
