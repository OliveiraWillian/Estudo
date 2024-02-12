package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();
        System.out.println("Funcionário: "+employee);
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println("Dados atualizados: "+employee);



        sc.close();
    }
}
