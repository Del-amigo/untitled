package Day12;

import java.util.Scanner;

public class Task3 {
    // write a program that prints word representation of your number
    // where number is 0 <= N <= 5
    // ex: 0 => zero
    // ex: 3 => three
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.println("Could U provide any number? ");
        int number1 = Number.nextInt();
        switch (number1){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("I dont know this number is");

        }
    }
}
