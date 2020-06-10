package Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    //Write a Java program to create a new array list, add some colors (string) and print out the collection.
    public static void main(String[] args) {
        System.out.println(colors());
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();
    }

    public static ArrayList<String> colors() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        return colors;

    }

    // Write a Java program to iterate through all elements in a array list.
    public static String colors(String str) {
        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        for (String element : list_Strings) {
            return element;
        }
        return str;
    }
}
