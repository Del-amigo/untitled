package Day13;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chand karata darkor shef?! ");
        int num = scanner.nextInt();
        int number = 1;
        while (10>=number){
            System.out.println(num+"x"+number+"="+num*number);
            number++;
        }
    }
}
