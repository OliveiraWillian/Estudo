package entities.enums;

import entities.Account;

public class AccountClient extends Account {
    private Double divida;
    private int contLivrosAlugados;

    public AccountClient(String name, int idade, String endereco, Double divida, int contLivrosAlugados) {
        super(name, idade, endereco);
        this.divida = divida;
        this.contLivrosAlugados = contLivrosAlugados;
    }
}
