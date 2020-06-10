package Day25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {
//Position, salary
    //String, double
    //SDET, 200_000
    //Principal, 300_000

    public static void main(String[] args) {
//        String[] positions = {"SDET", "Principal"};
//        double[] salaries = {200_000, 300_000};

        HashMap<String, Double> map = new HashMap<>();

//        public Object put(Object key, Object value): This method is used to insert an entry in this map.
        map.put("SDET", 200_000d);
        map.put("Principal", Double.valueOf(300_000));
        map.put("SDET", 210_000d);
        map.put("SDET", 250_000d);
        map.put("SDET", 390_000d);

//        public void putAll(Map map): This method is used to insert the specified map in this map.
        HashMap<String, Double> secondMap = new HashMap<>();
        secondMap.putAll(map);

        // 2. way, to copy map
        HashMap<String, Double> thirdMap = new HashMap<>(map);

//        public Object remove(Object key): This method is used to delete an entry for the specified key.
        map.remove("Principal");


//        public Object get(Object key):This method is used to return the value for the specified key.
        map.put("QA tester", 390_000d);
        Double sdetSalary = map.get("SDET");


//        public boolean containsKey(Object key): This method is used to search the specified key from this map.
        boolean hasQATester = map.containsKey("QA tester");


//        public Set keySet(): This method is used to return the Set view containing all the keys.
        Set<String> allKeysInMap = map.keySet();
  //     System.out.println("new"+ allKeysInMap);

//        public Set entrySet(): This method is used to return the Set view containing all the keys and values.
//        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for(Map.Entry<String, Double> row : map.entrySet()) {
            String key = row.getKey();
            Double value = row.getValue();

            System.out.println("Key: " + key + "\tValue: " + value);
        }
    }
}
