package entities;



import entities.enums.StatusConta;

public class AccountMestre extends Account {


    public AccountMestre() {
        super();
        this.statusConta = StatusConta.GERENTE;

    }

    public AccountMestre(String name, int conta, String senha) {
        super(name, conta, senha);
        this.statusConta = StatusConta.GERENTE;
    }

    @Override
    public String toString() {
        return "\tCONTA: " + conta + "\n\tGerente: " + name;

    }




    }








