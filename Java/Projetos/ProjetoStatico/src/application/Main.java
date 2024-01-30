package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do dólar? ");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados?");
        double buyDolar = sc.nextDouble();

        double dolarComImposto = CurrencyConverter.ConvesaoDolares(cotacaoDolar,buyDolar);
        System.out.println(dolarComImposto);



        sc.close();
    }
}
