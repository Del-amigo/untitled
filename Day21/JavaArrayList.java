package Day21;

import java.util.ArrayList;

public class JavaArrayList {
    // ArrayList
    // Set
    // Map
    public static void main(String[] args) {
        // declaring arrayLists
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringArrayList;
        ArrayList<Boolean> booleanArrayList;


        // initialize String ArrayList
        ArrayList<String> names = new ArrayList<>();
        // adding elements to arrayList
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");

        // adding element at specific position
        names.add(1, "Ali");
        System.out.println("1: just .add-bad digarosha tela mekna*"+names);
        // to get element from arrayList
        String elementAtIndex2 = names.get(2);
        System.out.println("2: get any element from list"+names.get(2));
        // to update/change/set element at specific position
      //  names.set(0, "Bulut");
        System.out.println("3"+ names.set(1,"Behruz"));

        // to get size/length of arrayList
        int sizeOfArrayList = names.size();
        System.out.println("4"+sizeOfArrayList);
        // check if arrayList is empty
        boolean empty = names.isEmpty();


        // to remove element
        names.remove("Aria");

        // to remove element at specific position
        names.remove(0);

        //print without any extra method
        System.out.println(names);

        // to remove everything from arrayList
        // names.clear();
    }
}
