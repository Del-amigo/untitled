package CodingBat;

import java.util.Arrays;

public class makeEnds {
/*    Given an array of ints, return a new array length 2 containing the first and last elements from the original
    array. The original array will be length 1 or more.

    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]  */

    public static void main(String[] args) {
        int[]array=new int[3];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        System.out.println(Arrays.toString(makeEnds(array)));
    }
    public static int[] makeEnds(int[] nums) {
 int firstElem = nums[0];
 int lastElem = nums[nums.length-1];
  return new int[]{firstElem,lastElem};
    }
}
