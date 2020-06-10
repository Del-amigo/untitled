package Day17;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(11);
        }
        System.out.println("the integers: " + Arrays.toString(arrays));
//  part2. check if an arrays of has 0, print => "it has zero"
  //*      for (int array : arrays) {
        // if (array == 0) {
        // System.out.println("It has zero");
        // }
        // }
        // for (int array : arrays) {
        // if (array == 10) {
        // System.out.println("It has ten");
        // }
        //
            //part4. check if array has 0 and 10, print => "it has zero and ten"
            System.out.println("Part 4 ---------------------------");
            //1. way
            // 0, 1 , 2 , 3 , 0
//        int zeroCounter = 0;
//        int tenCounter = 0;
//        for(int number : numbers) {
//            if(number == 0) {
//                zeroCounter++;
//            } else if(number == 10) {
//                tenCounter++;
//            }
//        }
//        if(zeroCounter >= 1 && tenCounter >= 1) {
//            System.out.println( "it has zero and ten" );
//        }
            //2. way
            boolean hasZero = false;
            boolean hasTen = false;
            for (int number : arrays) {
                if (number == 0) {
                    hasZero = true;
                } else if (number == 10) {
                    hasTen = true;
                }
            }
            if (hasZero && hasTen) {
                System.out.println("it has zero and ten");
            }

        }

    }