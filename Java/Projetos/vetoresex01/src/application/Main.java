package application;

import entities.VetorClass;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        VetorClass[] vetorClasses = new VetorClass[n];
        double mediaAltura = 0;
        for (int i = 0; i < vetorClasses.length; i++) {


            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("altura: ");
            double altura = sc.nextDouble();


            vetorClasses[i] = new VetorClass(nome, idade, altura);

            mediaAltura += vetorClasses[i].getAltura();

        }

        int cont = 0;
        System.out.println("Altura media: " + (mediaAltura / vetorClasses.length));
        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < vetorClasses.length; i++) {

            if (vetorClasses[i].getIdade() < 16) {
                System.out.println(vetorClasses[i].getNome() + " ");
                cont++;
            }
        }
        double percentualMenores = ((double) cont / vetorClasses.length) * 100.0;
        System.out.println("A porcentagem de pessoas com menos de 16 anos é de :" + String.format("%.2f",percentualMenores));


        sc.close();

    }
}
