package Day14;

import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randonNumber =rand.nextInt(10);
        System.out.print("Please guess a number: ");

        int x = 1;
        while(x > 0){
            int userInput = input.nextInt();
            if(userInput != randonNumber){
                System.out.print("Wrong, please try again: ");
            }
            else{
                System.out.println("Correct, the number was " + randonNumber);
                break;
            }
        }
    }
}
