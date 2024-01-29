package entities;

//classe Student

public class Student {
    //atributo
    public String name;
    public double nota1,nota2,nota3;

    //construtor
    public Student(String name, double nota1,double nota2,double nota3){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

//metodo
    public double mediaFinal (){
        double media = (this.nota1 + this.nota2 +  this.nota3);
     return media;
    }


}
