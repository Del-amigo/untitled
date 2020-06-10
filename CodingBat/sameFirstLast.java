package CodingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sameFirstLast {
    /*
    Given an array of ints, return true if the array is length 1 or more, and the first element and the
    last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
     */
    public static void main(String[] args) {
        int[]array=new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=1;
        System.out.println(sameFirstLast(array));
    }
    public static boolean sameFirstLast(int[] nums) {
        return nums.length>=1 && nums[0] == nums[nums.length-1];
    }
}
