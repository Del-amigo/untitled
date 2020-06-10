package day17;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Java2DArrayEx2 {
    //item prices

    //        Costco  Walmart  Aldii     Avarage
    // water   $0.25   $0.27    $0.30
    // bread   $0.70   $0.45    $1.05
    // meat    $7.35   $9.99    $7.30

    public static void main(String[] args) {
        double[][] itemPrices = {
                {0.25, 0.27, 0.30},
                {0.73, 0.45, 1.05},
                {7.35, 9.99, 7.31}
        };
        String[] markets = {" Costco", "Walmart", "  Aldii", " Avarage"};
        System.out.print("\t  ");
        for(String market : markets) {
            System.out.print( market + "  " );
        }
        System.out.println();
        //to print in formatted manner
//        System.out.printf( "%.2f\n", 0.3333333333 );
//        System.out.println( String.format( "%.2f", 0.3333333333 ) );

        String[] items = {"Water", "Bread", " Meat"};
        for (int row = 0; row < itemPrices.length; row++) {  //nested loop for print them all
            double sum = 0;
            for(int col = 0; col < 3; col++) {
                sum += itemPrices[row][col];
                System.out.print( "$" + itemPrices[row][col] + "\t" );
            }
            double avg = (sum / 3);
            System.out.println( "  " + String.format( "$%.2f", avg ) );
            }
            System.out.println();
            }
        }
           //part 2. calculate average of items

