package entities;

public class Class {
    private int numero;
    private String nome;
    private double valorConta;

    public Class(int numero, String nome, double valorConta) {
        this.setNumero(numero);
        this.setNome(nome);
        deposito(valorConta);
    }


    public Class(int numero, String nome) {
        this.setNumero(numero);
        this.setNome(nome);

    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public double getValorConta() {

        return valorConta;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


    public void deposito(double valorConta) {
        this.valorConta += valorConta;
    }

    public void retirada(double valorConta) {
        this.valorConta -=  valorConta - 5;

    }

    public String toString() {
        return "Account: " + numero + ", Holder: " + nome + ", Balance: $" + valorConta;
    }
}


