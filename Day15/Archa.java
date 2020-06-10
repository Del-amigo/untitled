package Day15;


public class Archa {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {     //first one for the number of rows,
            for (int j = 0; j < 10 - i; j++)//second one for printing the spaces,
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)//third one for printing the asterisks.
                System.out.print("*");
            System.out.println();
        }
    }
}
