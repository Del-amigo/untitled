package Day22;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Double> doubles = generateList();
        System.out.println(generateList());

        System.out.println();
    }

    // create a method that will generate arrayList of double with random double values
    public static ArrayList<Double> generateList() {
        ArrayList<Double> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(Math.random() * 100);
        }

        return list;
    }

    // create a method to retrieve an element at specified index from given arrayList
public static ArrayList<String> retrieve(ArrayList<String> indeex, String[]names){
indeex.get(1);
    return indeex;
}
    // create a method to update element in specified position

    }

