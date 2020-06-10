package Day20;

import java.util.ArrayList;

public class Task6 {

    public static void main(String[] args) {
        System.out.print("without parameter"+createArraylist());
        System.out.println("----------");
        System.out.print("with one parameter in it: "+ createArraylist(50));
        System.out.println("----------");
        System.out.println("multiple parameter"+createArraylist(4)); //flexible*
    }
    /*
    1.Create a method return type is an Integer Arraylist,name it createArraylist
    Add the numbers that less than 100 in your arraylist
    2. Overload your method to create different functions of arraylist
    3. Overload your method with varargs and add the even numbers in your list

     */
public static ArrayList<Integer>createArraylist(){
    ArrayList<Integer> myList = new ArrayList<>(); //List accepts objects, but Array accepts primitive datatypes
                                                  // and objects, that's the main difference betwn List and simple Array
    for (int i = 0; i < 100; i++) {
        myList.add(i);
    }
    return myList;
}
    public static ArrayList<Integer>createArraylist(int num){ //one parameter
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            myList.add(i);
        }
        return myList;
    }
    public static ArrayList<Integer>createArraylist(int...num){ //multiple parameter...varargs
        ArrayList<Integer> myList = new ArrayList<>();
        for (int each:num){
            myList.add(each);
        }
        return myList;
    }
}
