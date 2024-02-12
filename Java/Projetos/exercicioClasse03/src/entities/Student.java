package entities;

public class Student {
    public double n1,n2,n3;
    public String name;
    public double ponstoFaltando;


    public double soma(){
        return n1+n2+n3;
    }

    @Override
    public String toString() {
        String aux ;

        if(soma() >= 60){
            aux = "NOTA FINAL = " + String.format("%.2f",soma())+"\nPass";
        }else {
            aux = "NOTA FINAL = " + String.format("%.2f",soma())+"\nFailed"+"\nFaltaram "+ String.format("%.2f",this.ponstoFaltando = 60 - soma()) + " Pontos";

        }
        return aux;

    }
}
