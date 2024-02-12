package entities;

public class AccountFuncionario extends Account{
    private double salarioBruto;

    public AccountFuncionario(String name, int idade, String endereco, Double salarioBruto) {
        super(name, idade, endereco);
        this.salarioBruto = salarioBruto;
    }

    public Double getSalario() {
        return salarioBruto;
    }

    public void setSalario(Double salario) {
        this.salarioBruto = salario;
    }
}
