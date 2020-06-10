package ReplitCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Set2 {
    /*
    Create a method name is changeSet()
parameter is String hashset  and two Strings
return is hashset
if hasSet contains string 1 change it to string 2
for example:
hashset should be "banana" , "strawberry" , "kiwi" , "pineapple","banana"
String 1 = banana
String 2 = pineapple
result should be "pineapple" , "strawberry" , "kiwi" , "pineapple","pineapple"
     */
    public static HashSet<String> changeSet(HashSet<String> fruits, String fruitA, String fruitB){
             if( fruits.contains(fruitA) ) {
                fruits.remove(fruitA);
                fruits.add(fruitB);
            }
            return fruits;
    }



    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        String[] meyve = {"banana" , "strawberry" , "kiwi" , "durian", "apple"};
        for (String mey : meyve ) {
            fruit.add(mey);
        }
        changeSet(fruit, "banana","pineapple");
        System.out.println(changeSet(fruit, "banana","pineapple"));
    }
}
