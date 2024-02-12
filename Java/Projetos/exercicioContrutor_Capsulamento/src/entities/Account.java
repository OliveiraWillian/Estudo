package entities;

public class Account {
    private static double tax = 5.00;
    private int number; // numero da conta
    private String holder; // nome
    private double balance; // saldo da conta

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;

    }
    public void withdreaw(double amount){
        balance -= amount + tax;
    }

    @Override
    public String toString() {
        return "Account "+ number+", Holder: "+ holder+ ": $ " + balance;
    }
}
