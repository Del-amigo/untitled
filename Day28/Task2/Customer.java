package Day28.Task2;

public class Customer {
    String name;
    ElectricityAccount electricityAccount;

    double consumeElectricity(double wph) {
        if (wph < 0) {
            return 1;
        } else {
            electricityAccount.totalWph += wph;
            return wph;
        }
    }
}