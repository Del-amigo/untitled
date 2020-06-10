package Day28.Task2;

public class ElectricityAccount {
    double totalWph;
    double rate = 0.7;
    double bill;

    double calculateBill(){
        bill = rate*totalWph;
        return bill;
    }
}
