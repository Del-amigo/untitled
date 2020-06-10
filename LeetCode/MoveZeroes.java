package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    /*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the
    relative order of the non-zero elements.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
     */
    public static void main(String[] args) {
    int[] arr ={0,1,0,3,12};
        System.out.println(Arrays.toString( moveZeroes( arr )));
    }
    public static int[] moveZeroes(int[] nums) {
        int k = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[k++] = nums[i];
            else count++;
        }
        for (int i = 0; i < count; i++) {
            nums[nums.length - 1 - i] = 0;
        }
        return nums;
    }
}
