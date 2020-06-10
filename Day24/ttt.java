package Day24;

import java.util.ArrayList;

public class ttt {
    public static void main(String[] args) {

        int[] num = {9, 4, 9, 6, 7, 4};

        System.out.println(nonDuplicates(num));
    }



    public static ArrayList<Integer> nonDuplicates(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();

        for (int i : arr) {
            int counter=0;
            for (int i1 : arr) {
                if (i==i1){
                    counter++;
                }
            }
            if(counter==1){
                list.add(i);}
        }
        return list;
    }

}
