package ReplitCollections;

import java.util.ArrayList;

public class ArrayList3 {
    /*
    Instructions from your teacher:
Create a method name is getLength()
Parameter is one String ArrayList
return type is Integer arrayList
get the length of each String in the arrayList
return the each element length
For example
ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
print the length of the each String
result should be 10 ,  8 , 4 , 7 , 6
     */
    public static ArrayList<Integer> getLength(ArrayList<String> list){
        ArrayList<Integer> lengthOfStringsElements = new ArrayList<>(list.size());
        for (int i = 0; i <list.size() ; i++) {
            int length = list.get(i).length();
            lengthOfStringsElements.add(i, length);
        }
        return lengthOfStringsElements;
    }

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New jersey");
        cities.add("New york");
        cities.add("Ohio");
        cities.add("Florida");
        cities.add("Boston");

        System.out.println(getLength(cities));
    }
}
