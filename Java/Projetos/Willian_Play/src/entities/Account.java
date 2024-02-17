package entities;

public class Account {
    private Integer conta;
    private String name;
    private double saldo;

    public Account (){
    }
    public Account (Integer conta, String name){
        this.conta = conta;
        this.name = name;
    }
    public Account (Integer conta, String name, double deposito){
        this.conta = conta;
        this.name = name;
        deposito(deposito);
    }
    public Integer getConta(){
        return conta;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getSaldo(){
        return saldo;
    }


    public void deposito(Double valorDeposito){
        saldo += valorDeposito;
    }
    public void saque(double valorSaque){
        saldo -=valorSaque;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Numero da conta: %d, Saldo: $ %.2f %n",name,conta,saldo);
    }
}
