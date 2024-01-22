package entidadeclass;

public class Funcionario {
    public String name;
    public double salario;
    public double tax;

    public double nextSalario(){
        return this.salario - this.tax;
    }
    public void incremento(double porcentagem){
        salario += (salario * porcentagem) / 100;
    }
    public String toString(){
        return  name + " , $" + nextSalario();
    }
}
