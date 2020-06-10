package ReplitCollections;

import java.util.ArrayList;

public class ArrayList6 {
    /*
    Create a method name is hillNum()
Parameter is  integer ArrayList
return type is int
if the number smaller than previous number and greater than next number then print the number
for Example;
ArrayList is 5,4,6,2,1
             0 1 2 3 4
2 is smaller than 6 and greater than 1
return should be 2
     */
    public static int hillNum(ArrayList<Integer> intList){
        int a = 0;
        for (int i = 0; i <intList.size()-2 ; i++) {
            if (intList.get(i + 1) <intList.get(i) && intList.get(i + 1)>intList.get(i + 2)) {
                a = intList.get(i + 1);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(6);
        a.add(2);
        a.add(1);
        System.out.println(hillNum(a));
    }
}
