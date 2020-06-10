package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    /*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
     */
    public static void main(String[] args) {
        int[] array = {2,2,1,7,1};
        System.out.println( singleNumber( array ));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            if (set.contains( i )){
                set.remove( i );
            }else {
                set.add( i );
            }
        }
        for (int i: set){
            return i;
        }
        return 0;
    }
}
