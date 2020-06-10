package ReplitCollections;

import java.util.ArrayList;

public class ArrayList7 {
    /*
    Create a method name is common_values()
parameter is TWO integer arrayList
return type should be integer arrayList
Get two arraylist and return all the common values in the arraylist
For Example:
ArrayList 1: 3 , 2 , 5 , 6
ArrayList 2: 5 , 8 , 9
return should be 5
For Example2:
ArrayList 1: 8,7,9,6,7
ArrayList 2: 6,7,12,3,1
return should be 6,7
     */
    public static ArrayList<Integer> common_values(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonList = new ArrayList<>();
            for (int i = 0; i <list1.size() ; i++) {
                for (int j = 0; j <list2.size() ; j++) {
                    if (list1.get(i) == list2.get(j)){
                        commonList.add(list1.get(i));
                    }
                }
            }
        return commonList;
    }

    public static void main(String[] args) {
        //ArrayList 1: 3 , 2 , 5 , 6
        //ArrayList 2: 5 , 8 , 9
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        list1.add(5);
        list1.add(6);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(8);
        list2.add(9);
        System.out.println(common_values(list1, list2));
    }

}
