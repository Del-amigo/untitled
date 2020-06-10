package MentoringFromIbrahim;

import java.util.ArrayList;

public class AP2004Q1 {
    public static void main(String[] args) {
ArrayList<String> myList = null; // new Arraylist<>();
myList.add("cat");
myList.add("mouse");
myList.add("frog");
myList.add("cat");
myList.add("lion");
myList.add("giraffe");

        System.out.println(numWordsOfLength(myList, 5)); ///
    }
    public static int numWordsOfLength(ArrayList<String> Alist, int len){
        int c=0; //is a counter
        for (int i = 0; i < Alist.size(); i++) {
            if (Alist.get(i).length()==len)
                c++;

        }
        return c;
    }
}
