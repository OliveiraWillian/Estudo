package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<TaxPayer> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #"+i+" data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anuallncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                //
                list.add(new Individual(name,anuallncome,healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name,anuallncome,numberOfEmployees));

            }
        }

        System.out.println("TAXES PAID: ");
        double soma = 0.0;
        for (TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + ": $ "+ String.format("%.2f",taxPayer.tax()));
            soma += taxPayer.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f",soma));





        sc.close();
    }
}
