package HomeworksRepl.ClassAndTryCatch;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ClassObject3 {
    /*
    Class Total {
1. Create method named as StringToDouble.
Parameter is a String and Return type is double.
Remove the $ in the String, then change it to double.
Return the double.
2. Create method named as getTotal
Parameter is LinkedHashMap<String,String> and Return type is double.
By using the method StringToDouble:
 a. change values in the LinkedHashMap<String,String> into double values,
 b. sum all the double values and return the total.
}

Class Cart {
Create instance variables as:
1. String userName
2. LinkedHashMap<String , String> LMap
Create method named as addItem
Return type is void and parameters are String str1, String str2
Add str1 as key to LMap  and add str2 as value to LMap
Create method named as getPrice
Return type is void and Parameter is Total class
Call getTotal method from Total class.
Create a toString method and print the datas in order such as:
 User name is : Your Object username
 All elements are : All the key and values in the linkedHashmap
 Total price : Total Price of all the values
}

Class Main {
Create scanners for username, items and itemPrices.
Add the items and itemPrices to LinkedHashMap from Cart class.
Print your object
For example:
 username = Junior
 item1 -- Eggs     item1Price -- $3.19
 item2 -- Bread    item2Price -- $5.23
 item3 --  Water   item3Price -- $6.23
Print should be as
User name is : James
All elements are :{Eggs=$3.19, Bread=$5.23, Water=$6.23}
Total price : 14.65
}
     */
}
class Total {

    public double stringToDouble (String str){

        double result= Double.parseDouble(str.replace("$", "").trim());

        return result;
    }

    public double getTotal (LinkedHashMap<String,String> map){ //(key,value)

        double sum = 0;
        for (String value : map.values()) {
            sum += stringToDouble(value);
        }
        return sum;
    }
}

class Cart {
    //instance variables
    String userName; //POINTER
    LinkedHashMap<String, String> LMap; //LMap isminde bir map olusturacaksin tanimlamasi POINTER RAME POINT

    // LMap = new LinkedHashMap<>(); tanimlanan LMap objesini create ediyorum Bu satir RAM de LMAP isminde bir map create ediyor.
    public void addItem(String str1, String str2) {
        LMap.put(str1, str2);
    }

    public double getPrice() {
        Total tot = new Total();
        double price = tot.getTotal(LMap);
        return price;
    }

    public String toString() {
        return "\nUser name is : " + userName +
                "\nAll elements are : " + LMap +
                "\nTotal price : " + getPrice();
    }
}

    class Main {
        public static void main(String[] args) {
            Cart cart = new Cart();
            cart.LMap = new LinkedHashMap<>();

            Scanner scan = new Scanner(System.in);
            String username = scan.nextLine();
            cart.userName = username;
            String item1 = scan.nextLine();
            String item1Price = scan.nextLine();
            cart.addItem(item1, item1Price);
            String item2 = scan.nextLine();
            String item2Price = scan.nextLine();
            cart.addItem(item2, item2Price);
            String item3 = scan.nextLine();
            String item3Price = scan.nextLine();
            cart.addItem(item3, item3Price);

            System.out.println(cart);
        }
    }