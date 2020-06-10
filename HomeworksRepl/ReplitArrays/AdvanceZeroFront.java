package HomeworksRepl.ReplitArrays;

import java.util.Arrays;

public class AdvanceZeroFront {
    /*    Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
        grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes
        {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
        Create an array as 1,0,0,1,0
        result should be 0,0,0,1,1   */
    public static void main(String[] args){
        int[] array = {1, 0, 0, 1, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}