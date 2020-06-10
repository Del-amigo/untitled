package Day25;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<>();
                    //key   //value
        hashMap.put("Behruz",93.01);
        hashMap.put("Umarjon", 1.6 );
        hashMap.put("Abcd", 1.6);
        hashMap.put("Umarjon",15.66);
        hashMap.put("Behruz", 93d);
        hashMap.put("Umeda",91.02);
        System.out.println(hashMap);
        hashMap.remove(1.6);
        System.out.println(hashMap);
        Double sdetSalary = hashMap.get("Umeda");
        System.out.println(sdetSalary);
    }
}
