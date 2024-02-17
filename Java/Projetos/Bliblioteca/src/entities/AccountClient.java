package entities;

import entities.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountClient extends Account {
    private Double divida;
    private int contLivrosAlugados;
    private List<Livros> livrosAlugado = new ArrayList<>();


    public AccountClient() {
        super();
    }
    public AccountClient(String name, int idade, String endereco) {
        super(name, idade, endereco);


    }
    public void alugarLivro(Livros lista){
        livrosAlugado.add(lista);
    }

}
