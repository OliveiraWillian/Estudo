package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite quantos valor que cadastrar");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0;

        for (int i = 0; i < vect.length ; i++) {
            System.out.println("Dogite o " + (i+1) +" valor");
        vect[i] = sc.nextDouble();

        soma += vect[i];
        }

        System.out.println("Soma: "+ (soma/vect.length));


        sc.close();

    }



}
