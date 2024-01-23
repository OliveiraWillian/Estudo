package application;

import java.util.Scanner;
import entities.Class;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Class banco;

        System.out.println("Digite o numero da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome da conta: ");
        String nomeConta = sc.nextLine();

        System.out.println("Tem Dinheiro \"S\"/\"N\"");
        char temDinheiro = sc.nextLine().charAt(0);


        if (temDinheiro == 'S' || temDinheiro == 's' ){
            System.out.println("Digite o valor de deposito ");
            double depoistoConta= sc.nextDouble();
            banco = new Class(numConta,nomeConta,depoistoConta);


        }else {
            banco = new Class(numConta,nomeConta);


        }

        System.out.println(banco);
        System.out.println("Enter a deposit value:");
        banco.deposito(sc.nextDouble());
        System.out.println("Updated account data: " + banco);
        System.out.println("Enter a withdraw value:");
        banco.retirada(sc.nextDouble());
        System.out.println("Updated account data: " + banco);




        sc.close();
    }
}
