package Day12;

import java.util.Scanner;

public class TaskALPHABET {
    // Write a Java program to check whether a character is alphabet or not.
    // use just lowercase letters, a to z

    // ex1:  h => it is alphabet character
    // ex2: 10 => it is not in alphabet
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide anything, please: ");
        char alphabet;
        alphabet = scanner.next().charAt(0);
        if (alphabet>='a'&& alphabet <='z' || alphabet>='A' && alphabet<='Z' ){
            System.out.println("Alphabetical");
        }else{
            System.out.println("Not alphabetical");
        }
    }
}
