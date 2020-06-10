package Day25;

import java.util.Enumeration;
import java.util.HashMap;

public class ExampleForMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> namez = new HashMap<>();
        namez.put(1,"apple");
        namez.put(2,"banana");
        namez.put(3,"kiwi");
        namez.put(4,"orange");

        int myNum = 2;
        System.out.println(removing(namez,myNum));
    }

    public static HashMap<Integer,String> removing(HashMap<Integer, String> m1, int num){
        m1.remove(num);
        return m1;
    }
}
