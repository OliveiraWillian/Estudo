package entities;

public class Livros {
    private String name;
    private Double valor;
    private Integer id;
    private String autor;

    public Livros() {}

    public Livros(String name, double valor, int id, String autor) {
        this.name = name;
        this.valor = valor;
        this.id = id;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return String.format("Numero de Registro: %d, Livro: %s, Autor: %s, valor %.2f %n",id,name,autor,valor);
    }
}
