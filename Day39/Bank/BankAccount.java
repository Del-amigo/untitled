package Day39.Bank;

public class BankAccount {
    private String ownersName;
    private  int amount;

    public BankAccount(String ownersName, int amount) {
    if(amount<0){
        throw new RuntimeException("Can not create account with negative balanse");
    }
    this.amount = amount;
    this.ownersName = ownersName;
    }

    public void withDraw(int amountWithDraw){
        if (amount-amountWithDraw<0){
            try {
                throw new Exception("Not enough money");
            } catch (Exception exception) {//checked exception
                exception.printStackTrace();
            }
        }
        this.amount -= amountWithDraw;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ownersName='" + ownersName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
