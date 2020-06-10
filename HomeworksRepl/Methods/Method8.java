package HomeworksRepl.Methods;

import java.util.Arrays;

public class Method8 {
    /*
    Create one method name is  nextGreaterElement

which is accept two int arrays

returns int array

You are given two arrays nums1 and nums2 where nums1’s elements are subset of nums2. Look for the nums1's element
in the nums2 array and check if the next number after the found number in nums2 is greater than the found number.
 If it is, replace that number's place with the greater number from nums2. If there is no other number after the
  number found in nums2, put -1 for that place.

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.

Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]
Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.

Note:

All elements in nums1 and nums2 are unique.
     */
    public static void main(String[] args) {
int[] arr = {2,4};
int[] arr2={1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(arr,arr2)));
    }
    public static int[] nextGreaterElement(int[] a, int[]b){
        int[]array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j] && j!=b.length-1){
                    if(b[j]<b[j+1]){
                        array[i]=b[j+1]; break;
                    }
                }else{
                    array[i]=-1;
                }
            }
        }

        return array;
    }
}
//j==b.length-1 || i==j && b[j+1]<b[j]){
//                    array[i]=-1;
//                } else if (i == j && b[j+1]>b[j]) {
//                    array[i]=b[j+1];


