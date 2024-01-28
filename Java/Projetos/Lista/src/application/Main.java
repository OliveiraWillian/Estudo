package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        int aux = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #0" + (i + 1));

            if (aux != 0) {
                for (Employee d : list) {
                    do {
                        System.out.print("ID: ");
                        aux = sc.nextInt();
                    } while ((int) d.id == aux || 0 == aux);
                }
            } else {
                System.out.print("ID: ");
                aux = sc.nextInt();
            }
            int id = aux;
            sc.nextLine();
            System.out.print("NAME: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();
            list.add(new Employee(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int scanID = sc.nextInt();
        System.out.print("Enter the percentage:");
        int porcentagem = sc.nextInt();

        for (Employee i : list) {
            if ((int) i.id == scanID) {
                i.salary += i.salary * porcentagem / 100;
            } else {
                System.out.println("ID não encontrado.");
            }
        }
        System.out.println("List of employees");
        for (Employee i : list) {
            System.out.println(i);
        }
        sc.close();
    }
}
