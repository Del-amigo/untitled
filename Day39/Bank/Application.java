package Day39.Bank;

public class Application {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount( "Behruz", 100 );
        bankAccount.withDraw( 99 );
        System.out.println(bankAccount);
       /* BankAccount bankAccount1 = new BankAccount( "Umedam", -1 );
        bankAccount1.withDraw( 0 );*/
    }
}
