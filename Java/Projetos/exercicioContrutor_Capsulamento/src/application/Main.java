package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char ch = sc.next().charAt(0);
        Account account;
        if (ch == 'y') {
            System.out.print("Enter initial deposit value:");
            account = new Account(number, holder);
            account.deposit(sc.nextDouble());
        } else {
            account = new Account(number, holder);

        }
        System.out.println("Account data:");

        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.print("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdreaw(sc.nextDouble());
        System.out.print("Retirada account data:");
        System.out.println(account);



        sc.close();
    }
}
