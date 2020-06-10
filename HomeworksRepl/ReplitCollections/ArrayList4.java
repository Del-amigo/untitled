package ReplitCollections;

import java.util.ArrayList;

public class ArrayList4<strList> {
    /*
    Create a method name is changeInArraylist()
parameters are  String arraylist , String s1 ,String s2
Change s1 to s2 in the arraylist
return is String arraylist
For example:
Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
s1 = blue
s2 = yellow
change all the blue to yellow
result should be "yellow" , "red" , "yellow" , "red" , "yellow"
     */
    public static ArrayList<String> changeInArraylist(ArrayList<String> list, String s1, String s2 ){
        //ArrayList<String> list =new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(s1)) list.set(i, s2);
        }
        return list;
    }
}
