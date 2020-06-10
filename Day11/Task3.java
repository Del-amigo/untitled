package Day11;

import java.util.Scanner;

public class Task3 {
    /*
    Write a Java program to calculate profit or loss
    Input:
        cost price: 1000
        selling price: 1500
    Output:
        Profit: 500
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Cost price");
        int CostPrice = num.nextInt();
        System.out.println("Selling price");
        int SellingPrice = num.nextInt();
        int Totall = (CostPrice-SellingPrice);
        if (Totall>0){
            System.out.println("profit " + Totall);
        }else if (Totall<0){
            System.out.println("Loss " + (-Totall));
            //2. way
           // String profitOrLoss = total >= 0 ? "Profit: $" : "Loss: $";
            // System.out.println( profitOrLoss + Math.abs( total ) );
        }
    }
}
