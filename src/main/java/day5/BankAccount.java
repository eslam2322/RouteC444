package day5;

public class BankAccount {
    private double balance;
    public  BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("initial balance is negative");
        }
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        System.out.println("balance : " + balance);
        return balance;
    }
}
