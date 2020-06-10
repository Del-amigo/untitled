package CodeWars;

import java.util.Arrays;

public class SmallestIntegerFinder {
    /*
    Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
     */
    public static void main(String[] args) {
int[] array = {34, 15, 88, 2, -355};
        System.out.println(findSmallestInt(array));
    }
    public static int findSmallestInt(int[] args) {
int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i]<min){
                min = args[i];
            }
        }
        return min;
    }
}
