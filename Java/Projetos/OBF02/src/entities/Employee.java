package entities;

public class Employee {
    public String name;
    public double salarioBruto;
    public double impostoSalario;


    public double salarioLiquido(){
        return salarioBruto - impostoSalario;
    }

    public void aumento(double aumentoPorcentagem){
         salarioBruto += (salarioBruto * aumentoPorcentagem) / 100;

    }

    public String toString() {
        return name + ", $ " + salarioLiquido();
    }
}
