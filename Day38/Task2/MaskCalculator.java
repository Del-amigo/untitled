package Day38.Task2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MaskCalculator {
    public static void main(String[] args) {
        MaskCalculator maskCalculator = new MaskCalculator();

        ArrayList<Double>prices = maskCalculator.getPrices();
        System.out.println(prices);

        double priceAverage = maskCalculator.priceAverage( prices );
        DecimalFormat decimalFormat = new DecimalFormat("#,##");//
        String format = decimalFormat.format( priceAverage );
        System.out.println(format);

    }

    private double priceAverage(ArrayList<Double> prices) {
        double sum = 0;
        for (Double price : prices) {
            sum+=price;
        }
        if(sum==0){
            throw new ArithmeticException("Sum is zero, there is no an average");
        }
        return sum / prices.size();
    }

    // 1.create method that gets price from user until input user will be "Exit"
    private ArrayList<Double> getPrices() {
        ArrayList<Double> prices = new ArrayList<>();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Provide prices, please ");
        String strPrices = scanner.nextLine();

        while (!strPrices.equalsIgnoreCase( "exit" )){
            try {
                double price = Double.parseDouble( strPrices );
                // 2. add prices to Arraylist
                prices.add( price );
            }catch (NumberFormatException numberFormatException){
                System.out.println(numberFormatException.getMessage());
                System.out.println("Please provide valid price");
            }
            strPrices = scanner.nextLine();
        }
        return prices;
    }
    // 3.Create Method to get an average prices

}
