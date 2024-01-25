package application;

import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Digite o nome do Funcionário: ");
        employee.name = sc.nextLine();
        System.out.println("Digite o valor do salário bruto: ");
        employee.salarioBruto = sc.nextDouble();
        System.out.println("Digite o valor do imposto: ");
        employee.impostoSalario = sc.nextDouble();
        System.out.println("Funcionario: " + employee);
        System.out.println("Qual a porcentagem para aumentar o salário?");
        employee.aumento(sc.nextDouble());
        System.out.println("Dados Atualizados: " + employee);

        sc.close();
    }
}
