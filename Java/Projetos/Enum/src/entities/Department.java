package entities;

public class Department {
    //atributos
    private String name;

    //construtor
    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    //get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
