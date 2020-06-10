package Day14;

import java.util.Scanner;
// write a java program which will show
// multiplication table of 2
//ex:
//    2 x 1 = 2
//    2 x 2 = 4
//    ...
//    2 x 10 = 20
public class Task2 {
    public static void main(String[] args) {
        Scanner multiplication = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = multiplication.nextInt();
        for(int i=1; i <= 15; i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}
