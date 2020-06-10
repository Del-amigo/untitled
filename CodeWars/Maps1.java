package CodeWars;

import java.util.Arrays;

public class Maps1 {
    /*
    Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
     */
    public static void main(String[] args) {
        int[]arr={1, 2, 3};
        System.out.println(Arrays.toString(map(arr)));
    }
    public static int[] map(int[] arr) {
    int[] arr1 = new int[3];
    arr1[0]=arr[0]*2;
    arr1[1]=arr[1]*2;
    arr1[2]=arr[2]*2;
    return arr1;
    }
}
