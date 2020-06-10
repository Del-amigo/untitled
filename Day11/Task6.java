package Day11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it? " + " hour/minute ");
        double num = scanner.nextDouble();
        if (num >= 8 && num < 12) {
            System.out.println("Good Mornin'");
        } else if (num >= 12 && num < 18) {
            System.out.println("Good Afternoon");
        } else if (num >= 18 && num < 22) {
            System.out.println("Good Evening");
        } else if (num >= 22 && num <= 24.59) {
            System.out.println("Good Night");
        } else if (num >= 24.60){
            System.out.println("R U kiddin'");
        }
    }
}
