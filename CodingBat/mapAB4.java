package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    /*
    Modify and return the given map as follows: if the keys "a" and "b" have values that have
     different lengths, then set "c" to have the longer value. If the values exist and have
     the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
     */
    public static void main(String[] args) {
        HashMap<String, String> abz = new HashMap<>();
        abz.put("a", "aaaaa");
        abz.put("b","bbb");
     //   abz.put("c", "cake");
        System.out.println(mapAB4(abz));
        System.out.println(abz.get("a").length());
    }
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
        int x = map.get("a").length();
        int y = map.get("b").length();
        if (x>y){
            map.put("c",map.get("a"));
        }else if(x<y){
            map.put("c", map.get("b"));
        }else{
            map.put("a","");
            map.put("b","");
        }
        }
        return map;
    }
}
