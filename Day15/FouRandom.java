package Day15;

import java.util.Random;

public class FouRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(20);
            System.out.println("Random number is: " + number);
            counter=number+counter;
        }
        System.out.println("total number: " + counter);
    }
}
