package HomeworksRepl.ReplitArrays;

import java.util.Arrays;

public class SecondMax {
/*    Create an int array 15 , 25 , 22 , 18 , 30
    Write a Java program to find the second largest element in an array  */
public static void main(String[] args) {
    int[]a= {15, 25, 22, 18, 30};
    Arrays.sort(a);
    int inddex = a.length-1;
    while (a[inddex]==a[a.length-1]){
    inddex--;
    }
    System.out.println(a[inddex]);
}
}
