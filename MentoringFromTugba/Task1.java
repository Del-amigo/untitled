package MentoringFromTugba;

import java.util.ArrayList;

public class Task1 {
    /*
    1.Create a method return type is an Integer Arraylist,name it createArraylist
    Add the numbers that less than 100 in your arraylist
    2. Overload your method to create different functions of arraylist
    3. Overload your method with varargs and add the even numbers in your list

     */
    public static ArrayList<Integer> createArraylist() {  // 0 parameter

        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(i);

        }
        return myList;
    }

    public static ArrayList<Integer> createArraylist(int num) { // 1 parameter

        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            myList.add(i);

        }
        return myList;
    }

    public static ArrayList<Integer> createArraylist(int... num) { // more than 1 parameters   int[] num={1,6,8,9,17,900}

        ArrayList<Integer> myList = new ArrayList<>();

        for (int each : num) {
            if (each % 2 == 0) {
                myList.add(each);
            }
        }
        return myList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> myNewList = createArraylist(24);

        ArrayList<Integer> myNewList2 = createArraylist(1, 3, 67, 78, 4);

        System.out.println(myNewList);
        System.out.println(myNewList2);

    }
}
