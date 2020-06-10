package HomeworksRepl.Methods;

import java.util.Arrays;

public class methodFourtn {
    /*
Write a method called append
That accepts two integer arrays as parameters
and returns a new array that contains the result of appending the second array's values at the end of the first array.
 For example, if arrays array1 and array2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively,
 the call of append(array1 , array2 ) should return a new array containing
 {2, 4, 6, 1, 2, 3, 4, 5}.

     */
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(append(array1, array2)));
    }

    public static int[] append(int[] num1, int[] num2) {
        int length = num1.length + num2.length; //1.sum of integer[];

        int[] result = new int[length]; //2.created a new [], where's our previous length is as a result*
        int pos = 0; //3.int as a couneter
        for (int element : num1) {
            result[pos] = element;
            pos++;
        }

        for (int element : num2) {
            result[pos] = element;
            pos++;
        }
        return result;
    }
}
