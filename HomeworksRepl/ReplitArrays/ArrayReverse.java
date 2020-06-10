package HomeworksRepl.ReplitArrays;

import java.util.Arrays;

public class ArrayReverse {
  /*  Given an integer which is 123, reverse digits of an integer.
            Example :
    Input: 123
    Output: 321 */
  public static void main(String[] args) {
      int[] array= {1,2,3};
      int[] array321=new int[3];
      array321[0]=array[array.length-1];
      array321[1]=array[array.length-2];
      array321[2]=array[array.length-3];
      System.out.println(Arrays.toString(array321));
  }
}
