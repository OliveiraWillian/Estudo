package entities;

public class Rectangle {
    //Atributos
    public double largura, altura;

    //metodos
    public double area() {
        return largura * altura;

    }

    public double perimetro() {
        return (largura + altura) * 2;
    }

    public double diagonal(){
      return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }


    public String toString() {
        return "Area: " + area() + "\n Perimetro: " + perimetro() + "\n Diagonal: " + diagonal();
    }



}
