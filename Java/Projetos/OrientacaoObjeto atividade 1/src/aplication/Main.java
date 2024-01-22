package aplication;

import entidadeclass.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionario");
        funcionario.name = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        funcionario.salario = sc.nextDouble();
        System.out.println("Digite o valor da taxa");
        funcionario.tax = sc.nextDouble();
        System.out.println("Funcionario: " + funcionario);
        System.out.println("Qual a porcentagem para aumentar o salario ?");
        funcionario.incremento(sc.nextDouble());
        System.out.println("Dados Atualizados: " + funcionario);


        sc.close();

    }

}
