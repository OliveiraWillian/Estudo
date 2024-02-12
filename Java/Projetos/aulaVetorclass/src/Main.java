

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite quantos valor que cadastrar");
        int n = sc.nextInt();


        Product[] vect = new Product[n];
        double soma = 0;

        for (int i = 0; i < vect.length ; i++) {
            System.out.println("Dogite o " + (i+1) +" nome");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Dogite o " + (i+1) +" price");

            double price = sc.nextDouble();

            vect[i] = new Product(name,price);

            soma += vect[i].getPrice();
        }

        System.out.println("Soma: "+ (soma/vect.length));


        sc.close();

    }



}
