package application;

import entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employes will be registered? ");
        int n = sc.nextInt();
        List<Account> acc2 = new ArrayList<>();
        acc2.add(new Account());
        List<Account> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {



            System.out.print("ID ");
            int number = sc.nextInt();

            System.out.print("Name ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Salary:");
            Account account = new Account(number, holder);
            account.deposit(sc.nextDouble());

            list.add(account);

        }






        System.out.print("Enter the employee id that will have salary increase: ");
        int number = sc.nextInt();


        System.out.println("List of employees");

        Account acc = list.stream().filter(x -> x.getNumber() == number).findFirst().orElse(null);

        if (acc == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            acc.aumentosalario(percentage);
        }









        sc.close();
    }
}
