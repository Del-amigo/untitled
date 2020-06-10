package Day22;

import java.util.ArrayList;

public class Set {
    /*

 Count how many times your parameter String occurs in the arraylist and return the count

For Example:
ArrayList is Orange , Kiwi , Peach , Banana , Orange

String is Orange

count should be 2

     */
    public static void main(String[] args){
ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Peach");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(getCount(fruits,"Orange"));

    }


    public static int getCount(ArrayList<String> list, String str){
        int c=0;
        for (int i = 0; i <list.size() ; i++) {
            if (str.equals(list.get(i))) c++;
        }
        return c;
    }
    /*
    HashSet
              Print(return) randomlY*
              && Just one nul value without duplicate
    LinkedHashSet
              Print as we stored*
    TreeSet
              Print Alphabetical order, Number smaller to bigger*
              && U can't not accepts any null values

Hashset>TreeSet>LinkedHashSet
performance differences, they are kind of faster from each other
     */
}
