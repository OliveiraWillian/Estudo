package application;


import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter department's name");
        String departmentName = sc.nextLine();
        System.out.println("\n Dados do trabalhador: ");
        System.out.print("\n Name: ");
        String workerName = sc.nextLine();
        System.out.print("\n Level:");
        String workerLevel = sc.nextLine();
        System.out.print("\n Base salary:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));
        System.out.print("\n How many contracts to this worker?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("\n Enter contract #0%d data: ",i);

            System.out.print("\n Date (DD/MM/YYYY):");
            Date ContractDate = sdf.parse(sc.next());
            System.out.print("\n Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.print("\n Duration (hours):");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(ContractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " +String.format("%.2f" , worker.income(year,month)));
        sc.close();
    }
}
