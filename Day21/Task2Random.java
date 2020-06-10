package Day21;

import java.util.ArrayList;
import java.util.Random;

public class Task2Random {
    // create a method that will fill arrayList of integers with random numbers
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        list.add(random.nextInt(5));
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));

        System.out.println(list);
    }



    }
