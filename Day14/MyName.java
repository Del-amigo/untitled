package Day14;

import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        String reverse = "";
        for (int i = name.length()-1; i >=0; i--) {
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
    }
}
