package entities;
import entities.enums.StatusConta;


public class Account {
    protected String name;
    protected int conta;
    protected String senha;
    protected StatusConta statusConta = StatusConta.NULL ;


    public Account() {
    }

    public Account(String name, int conta, String senha) {
        this.name = name;
        this.conta = conta;
        this.senha = senha;
    }

    public StatusConta getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }





}
