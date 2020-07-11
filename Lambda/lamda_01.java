package Lambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class lamda_01 {
    public static void main(String[] args) {
        String word = "aaaaabbbbbbbcccccddddaaaadddeffggggggghjklmzzzzzzzzzzzzzzzzz";
        Map<Character, Integer>map = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt( i ))){
                map.put( word.charAt( i ),1 );
            }else {
                map.put( word.charAt( i ),map.get( word.charAt( i ) )+1 );
            }
        }
      // System.out.println(map);
     /*   for (Map.Entry each : map.entrySet()) {
            System.out.println("Word contains "+each.getValue()+" times "+each.getKey());
        }*/
        map.forEach( (k,v)->{
            System.out.println("Word contains "+v+" times "+k);
        } );

        // So here instead of looping U may do same function with "Lambda expression"
                                                          // which is more simple and readable*

    }
}
