package ReplitCollections;

import java.util.ArrayList;
import java.util.HashSet;

public class Set3 {
    /*
    Create method name is commonValues()
parameters are two hashsets
return type  is an arraylist
Example:
     first hashset is : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
     second hashset is : "Germany" , "China" , "Brazil" , "France" ,  "USA"
add all the common values in the arraylist
output is  "Germany" , "Brazil" ,"USA"
 print the arraylist
     */
    public static ArrayList<String> commonValues(HashSet<String> first, HashSet<String> second){
        //first.retainAll(second);
        ArrayList<String> arr1= new ArrayList<String>(first);
        ArrayList<String> arr2= new ArrayList<String>(second);
        ArrayList<String> common= new ArrayList<String>();

        for (int i = 0; i <arr1.size() ; i++) {
            for (int j = 0; j <arr2.size() ; j++) {
                if( arr2.get(j) == arr1.get(i) ){
                    common.add(arr2.get(j));
                }
            }
        }
        return common;
    }
public static void main(String[]args){

        }
}
