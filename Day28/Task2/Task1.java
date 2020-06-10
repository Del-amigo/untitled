package Day28.Task2;

import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.name = "Derullo";


        ElectricityAccount electricityAccount = new ElectricityAccount();
        customer.electricityAccount = electricityAccount;
customer.consumeElectricity(0);
customer.consumeElectricity(0);
customer.consumeElectricity(0);
customer.consumeElectricity(-10000);
        System.out.println(customer.name);
        System.out.println(customer.electricityAccount.bill);
        System.out.println(customer.electricityAccount.totalWph);
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        System.out.println(decimalFormat.format(electricityAccount.calculateBill())); /////new format mf
    }
}
