package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Employee #" + i + " Data: ");
            System.out.println("o Empregado é Tercerizado [Y/n] ? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalcharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalcharge);
            list.add(emp);
            }else {
                Employee emp = new Employee(name,hours,valuePerHour);
                list.add(emp);
            }

        }
        System.out.println();
        System.out.println("Payment");
        for (Employee empp :list){
            System.out.println(empp.getName()+ "- $" +empp.payment());
        }
        sc.close();
    }
}
