package HomeworksRepl.ReplitArrays;

public class Array14 {
    /*
Given an array of ints (intArr), return true if it doesn't contain 1 and 4 at the same time.
If it does contain them at the same time, return false.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true


Create an array 1,2,3,4

the result should be false

NOTE: If you change the array as 1,2,3 result should be true
     */
    public static void main(String[] args) {
        int counterOne=0;
        int counter4or=0;

        int[]arr={1, 2, 3,4};
        for(int i : arr){
           if(i==1){
               counterOne++;
           }
           if (i==4){
               counter4or++;
           }
        }
        System.out.println(counterOne <= 0 || counter4or <= 0);
    }
}
