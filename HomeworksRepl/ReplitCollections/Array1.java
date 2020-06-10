package ReplitCollections;

public class Array1 {
    /*
    Create a method name is duplicate()
parameter is int array
return type is boolean
if there is duplication in the array return true
if there is not duplication in the array return false
  Example 1:
Input: [1,2,3,1]
Output: true
Example 2:
Input: [1,2,3,4]
          i j
Output: false
     */
    public static boolean duplicate(int[] array){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > i; j--) {
                if( array[i] == array[j]){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
