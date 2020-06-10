package day5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your firstname?");
        String text = scan.nextLine();
        System.out.println("What is your last name?");
        String text1= scan.nextLine();
        System.out.println(text + " " + text1);

    }
}
