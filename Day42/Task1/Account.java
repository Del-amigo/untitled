package Day42.Task1;

import Day28.Task2.Customer;
import Day31.Example1.PublicModifierClass;

public class Account {
private String number;
private double balance;
private int withdraw;
private Currency currency;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String  getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }
    public double withdrawCount(double cash ){
        if (balance<cash){
            throw new RuntimeException("You don't have enough money in your account."
                                      + "Your is equal to "+balance );
        }
   return balance-=cash;
    }

    public void deposit(double cash){
        if (cash>5000){
            throw new RuntimeException("Please, visit your bank clerc");
        }
        balance=balance+cash;
    }


    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class Bank{
    public static void main(String[] args) {
      Account account = new Account(Currency.USD);
      account.setNumber("153371");
      account.deposit( 100 );
      account.withdrawCount( 55 );
        System.out.println(account);
        System.out.println(account.getNumber());
    }
}
