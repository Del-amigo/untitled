package HomeworksRepl.Methods;

import java.util.Arrays;

public class methodSeven {
    /*
    Create one method name is plusOne
This method takes parameter as int array
In this array actually you have the digits of a positive number and you number's first digit can not be 0,
except  your number 0 itself .
You are expected to add 1 to the middle digit.
Returns type will be int array

Example 1:
Input: [1,2,3]
Output: [1,3,3]
Explanation: The array represents the integer 133.

Example 2:
Input: [4,3,5,2,1]
Output: [4,3,6,2,1]
Explanation: The array represents the integer 43621.
     */
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 4;
        array[1] = 3;
        array[2] = 5;
        array[3] = 2;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(plusOne(array)));
    }

    public static int[] plusOne(int[] nums) {
        int midElem = nums[nums.length / 2]+1;
        if(nums.length==3) {
            return new int[]{nums[0], midElem, nums[nums.length - 1]};
        }else if (nums.length==5){
            return new int[]{nums[0],nums[1],midElem,nums[nums.length-2],nums[nums.length - 1]};
        }return nums;
    }
}
