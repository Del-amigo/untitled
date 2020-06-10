package Day8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Provide your cash by Dollar, please");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double num1 = (num * 10.2);
        System.out.println("Your " + num + " Dollar wil be: " + new DecimalFormat("00.00").format(num1) + " in Somoni");
    }
}