package entities;

import entities.enums.StatusConta;



public class AccountFuncionario extends Account {


    public AccountFuncionario() {
        super();
        this.statusConta = StatusConta.FUNCIONARIO;


    }

    public AccountFuncionario(String name, int conta, String senha) {
        super(name, conta, senha);
        this.statusConta = StatusConta.FUNCIONARIO;

    }





    @Override
    public String toString() {
        return "\tCONTA: " + conta + "\n\tFuncionario: " + name;

    }
}
