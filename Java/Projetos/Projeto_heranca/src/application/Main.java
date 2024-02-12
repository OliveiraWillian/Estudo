package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        /*Account account = new Account(1001,"Alex",0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002,"Maria",0.0,500.00);

        //UpCasting
        Account account1 = businessAccount;
        System.out.println(account1.getBalance());
        Account account2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account account3 = new SavingsAccount(1004,"Anna",0.0,0.01);

        //DOWNCASTING
        BusinessAccount businessAccount1 = (BusinessAccount) account2;
        businessAccount1.loan(5);



        //oque tiver na variavel Account 3 for um objeto que for instancia de BusinessAccount, então
        if(account3 instanceof BusinessAccount){
            BusinessAccount businessAccount2 = (BusinessAccount) account3;
            businessAccount2.loan(200.0);
            System.out.println("Loan!");
            //oque tiver na variavel Account 3 for um objeto que for instancia de SavingsAccount, então
        }if(account3 instanceof SavingsAccount){
            SavingsAccount savingsAccount = (SavingsAccount) account3;
            savingsAccount.updateBalance();
            System.out.println("Update");

        }


*/
       Account account = new Account(1001,"alex",1000.0);
       account.withdraw(200.0);
        System.out.println(account.getBalance());
        Account savingsAccount = new SavingsAccount(1001,"alex",1000.00,0.0);
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getBalance());

Account acc3 = new BusinessAccount(1003,"Boob",1000.0,500.0);
acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}

