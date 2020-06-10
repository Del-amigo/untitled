package Day16;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    // create an array with size 10
    // populate your array with random numbers using Random or Math.random()
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) { // 0 1 2 3 4 5 6 7 8 9
            array[i] = random.nextInt( 100 );
        }
        System.out.println("the integers: " + Arrays.toString(array) );
        //part2: sum of them
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
        // part3: get average of array
        System.out.println("avarage is:" + ((double)sum/array.length));
    }
    }
