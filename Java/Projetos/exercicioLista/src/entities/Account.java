package entities;

public class Account {
    private static double tax = 5.00;
    private int number; // numero da conta
    private String holder; // nome
    private double salario; // saldo da conta

    public Account() {

    }

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
        return salario;
    }

    public void deposit(double amount) {
        salario += amount;

    }

    public void aumentosalario(double porcento) {
        salario += salario * porcento / 100;

    }



    public void withdreaw(double amount) {
        salario -= amount + tax;
    }

    @Override
    public String toString() {
        return number + ", " + holder + ", $ " + salario;
    }
}
