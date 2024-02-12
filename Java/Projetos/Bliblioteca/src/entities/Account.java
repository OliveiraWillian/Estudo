package entities;

public abstract class  Account {
    //private Data data;
    //data tem que ser imprementada no futuro.
    private String name;
    private int idade;

    private String endereco;



    //Contrutor
    public Account() {}
    public Account(String name, int idade, String endereco) {
        this.name = name;
        this.idade = idade;
        this.endereco = endereco;
    }

    //Get and set

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}

