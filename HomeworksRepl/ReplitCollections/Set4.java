package ReplitCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set4 {
    /*
    Create a method name is removing()
parameter  is one linkedHashset and two Strings
if Strings exist in the linkedHashSet remove the String
return the hashset
For example
linkedhashset is : Germany , France , USA , Canada , Mexico , Brazil
String 1 is Germany
String 2 is USA
remove the Germany and USA
return Set.
     */
    public static HashSet<String> removing(LinkedHashSet<String> str1, String a, String b) {
        str1.removeIf(word -> word == a || word == b);
        HashSet<String> setNew = new HashSet<>(str1);
        return setNew;
    }



    public static void main(String[] args) {
        LinkedHashSet<String> str1 = new LinkedHashSet<String>();
        String[] countries = {"Germany", "France", "USA", "Canada", "Mexico", "Brazil"};
        for (String cntr : countries) {
            str1.add(cntr);

        }
    }
}