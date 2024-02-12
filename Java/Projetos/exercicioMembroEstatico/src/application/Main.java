package application;

import ultio.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Qual o valor do dolar? ");
        double dolar = sc.nextDouble();

        System.out.println("Quantos dolares serao comprados? ");
        double buyDolar = sc.nextDouble();

        System.out.println("Valor a ser pago em reais: " + CurrencyConverter.converteDolar(dolar, buyDolar));




        sc.close();

    }
}
