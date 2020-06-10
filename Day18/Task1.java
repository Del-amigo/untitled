package Day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    // Create 2D array
    // in first row put names
    // in second row put surnames
    // Hint:
    // String[][] namesAndSurnames
    public static void main(String[] args) {
        String[][] namesAndSurnames = {{"Samil", "Balci"},
                                       {"Furkat", "Ali"},
                                       {"Behruz", "Jumaev"}
        };
          System.out.println(namesAndSurnames[0][0]+ " "+ namesAndSurnames[0][1]);
          System.out.println(namesAndSurnames[1][0]+ " "+ namesAndSurnames[1][1]);
          System.out.println(namesAndSurnames[2][0]+ " "+ namesAndSurnames[2][1]);

        //   for (int row = 0; row < 3; row++) {
     //       for (int col = 0; col < 2; col++) {
     //           System.out.println(namesAndSurnames[row][col]+ "  ");
            }
        }
