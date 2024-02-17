package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resposta;

        System.out.println("Cadastro bancario");
        System.out.print("Digite o numero da conta");
        int numCont = sc.nextInt();

        System.out.print("Digite o nome do Titular");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Voce quer depositar algum valor (s/n)");
        char ch = sc.next().toLowerCase().charAt(0);

        Account account;
        if (ch == 's') {
            System.out.print("Digite o Valor do deposito: ");
            double saldo = sc.nextDouble();
            account = new Account(numCont, name, saldo);


        } else {
            account = new Account(numCont, name);
        }

        do {


            System.out.println("Gerenciar conta do cliente " + account.getName());
            System.out.println("[1] Depositar dinheiro na conta. ");
            System.out.println("[2] Sacar dinheiro na conta. ");
            System.out.println("[3] Consultar o saldo atual. ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Depoisto Bancario:");
                    System.out.print("Digite o Valor: ");
                    account.deposito(sc.nextDouble());
                    break;

                case 2:
                    System.out.println("Sacar Dinheiro:");
                    if(account.getSaldo() > 0){
                    System.out.print("Digite o Valor: ");
                    account.saque(sc.nextDouble());
                    }else {
                    System.out.println("Voce não tem saldo suficiente");
                }


                    break;
                case 3:
                    System.out.println("Veirificar Saldo bancario");
                    System.out.println(account);
                    break;
                default:
                    System.out.println("Numerro invalido");
                    break;

            }
            System.out.println("Voce quer continaur (s/n)");
            resposta = verificacao(sc);

        } while (resposta == 's');


        sc.close();
    }

    public static char verificacao(Scanner sc) {
        char ch2;
        int cont = 0;
        do {
            if (cont == 0) {
                ch2 = sc.next().toLowerCase().charAt(0);
            } else {
                System.out.println("Erro: Digite somente [s/n]");
                ch2 = sc.next().toLowerCase().charAt(0);
            }
            cont++;
        } while (ch2 != 's' && ch2 != 'n');
        return ch2;
    }
}
