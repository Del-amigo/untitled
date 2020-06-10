package Day12;

import java.util.Scanner;

public class concatTask {
    public static void main(String[] args) {
        /*
        take two strings by using scanner class and add each other
        Example: "abc", "cat" --> "abcat"
               "abc", "dog"  -->"abcdog"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text1");
        String t1 = scanner.nextLine();
        System.out.println("Text2");
        String t2 = scanner.nextLine();
        if (t1.endsWith("c")){
            System.out.println("cat");
        }
        if(t2.endsWith("d")){
            System.out.println("dog");
        }
    }
}
