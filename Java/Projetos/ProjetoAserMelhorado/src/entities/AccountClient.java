package entities;
import entities.enums.StatusConta;



public class AccountClient extends Account {

    private double saldo;
    private double emprestimo;

    public AccountClient() {
        super();
        this.statusConta = StatusConta.CLIENTE;

    }
    public AccountClient(String name, int conta, String senha) {
        super(name, conta, senha);
        this.statusConta = StatusConta.CLIENTE;


    }
    public AccountClient(String name, int conta, String senha,double depositoInicial) {
        super(name, conta, senha);
        deposito(depositoInicial);
        this.statusConta = StatusConta.CLIENTE;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    //Metodos
    public void deposito(double valorDep) {
        saldo += valorDep;
    }
    public void saque(Double valorSaq) {
        saldo -= valorSaq;
    }
    public void empresimo(double valor){
        this.emprestimo += valor + (valor * 0.10);
    }


@Override
    public String toString() {
        return "\tCONTA: "
                + conta
                +"\n\tNOME: "
                +name
                +"\n\tSALDO: "
                +String.format("%.2f", saldo);

    }
}
