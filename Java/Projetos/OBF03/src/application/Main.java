package application;

import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // iniciar o leia
        System.out.print("Digite seu Nome: "); //escreva

        String name = sc.nextLine(); // leia
        double n1, n2, n3; // var

        do { // inicio do laço, quando é do é executado no minimo uma vez o codigo.
            System.out.println("Digite a primeira nota"); //escreval
            n1 = sc.nextDouble(); // leia n1

        } while (n1 <= 0 || n1 > 30); // condição do laço

        do {
            System.out.println("Digite a Segunda nota");
            n2 = sc.nextDouble();
        } while (n2 <= 0 || n2 > 35);

        do {
            System.out.println("Digite a Terceira nota");
            n3 = sc.nextDouble();
        } while (n3 <= 0 || n3 > 35);

        // chamando a classe é passando pro parametro
        Student student = new Student(name, n1, n2, n3); // Contrutor

        double mediaFinal = student.mediaFinal(); // acessei o metodo (MediaFINAL) dento da classe student e gravei o valor de retorno da classe student na variave double mediaFinal

        System.out.println("NOTA FINAL = " + mediaFinal); // escreval, a soma da mediaFinal

        double faltaNota ;

        if (mediaFinal < 40) { // condição
            System.out.println("Reprovado"); //escreval reprovado
            faltaNota = (60 - mediaFinal); //
            System.out.println("Falta" + faltaNota + "Pontos");
        } else if (mediaFinal < 60) {
            System.out.println("Recuperação");
            faltaNota = (60 - mediaFinal);
            System.out.println("Falta " + faltaNota + "Pontos");
        } else {
            System.out.println("aprovado");
        }
        sc.close(); // fim do leia, fecha o console de leitura
    }
}
