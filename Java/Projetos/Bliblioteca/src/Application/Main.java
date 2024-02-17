package Application;

import entities.Account;
import entities.AccountClient;
import entities.AccountFuncionario;
import entities.Livros;
import util.LimpaTela;


import java.awt.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variavel
        char resposta;
        boolean topoMenu = false;
        List<Livros> list = new ArrayList<>();

        System.out.println("Bliblioteca Online");
       /* System.out.println("Cadastro Funcionario:");
        System.out.print("Nome:");
        String name = sc.nextLine();
        System.out.print("Idade:");
        int idade = sc.nextInt();
        System.out.print("Endereço:");
        sc.nextLine();
        String endereco = sc.nextLine();
        System.out.print("Salario Bruto: ");
        double salarioBruto = sc.nextDouble();*/
        AccountFuncionario accountFuncionario = new AccountFuncionario("willian", 15, "Rua Bruno Mordhorst", 1200.00);

        do {
            // quero que limpe a tela aqui
            LimpaTela.click();

            System.out.println("Bem vinda ao Gerenciamento da bliblioteca " + accountFuncionario.getName().toUpperCase());
            System.out.println("Livros Cadastro: " + list.size());

            System.out.println("Digite 1 para cadastrar um livro");
            System.out.println("Digite 2 para Ver os livros cadastrados");
            System.out.println("Digite 3 para Deleta algum livro");
            System.out.println("Digite 4 para Encontra um livro");
            System.out.print("Digite um numero: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    //list.add(cadastraLivro(sc));
                    list.add(new Livros("Java", 40.00, 333, "Willian Java"));
                    list.add(new Livros("JavaScript", 40.00, 222, "Willian Java Script"));
                    list.add(new Livros("C#", 40.00, 444, "Willian C#"));
                    list.add(new Livros("Python", 40.00, 666, "Willian Python"));
                    list.add(new Livros("C++", 40.00, 555, "Willian C++"));
                    list.add(new Livros("Html", 40.00, 111, "Willian html"));

                    break;
                case 2:
                    mostraLivro(list);
                    break;
                case 3:
                    do {
                        mostraLivro(list);
                        System.out.print("Escolha um numero de registro: ");
                        int id = sc.nextInt();
                        Livros pesquisa = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                        if (pesquisa != null) {
                            System.out.println("Livro Encotrado");
                            System.out.print(pesquisa);

                            System.out.print("Deseja Apagar o livro [s/n]: ");
                            resposta = verificacao(sc);
                            if (resposta == 's') {
                                list.remove(pesquisa);
                                System.out.println("Livro " + pesquisa.getName() + " Apagado");
                            } else {
                                System.out.println("O livro não foi apagado");
                            }

                        } else {
                            System.out.println("Livro não foi encontrado");
                        }
                        System.out.println("Deseja volta pro menu inicial [ s / n ]");
                        resposta = verificacao(sc);
                        Thread.sleep(1000);

                        LimpaTela.click();

                    } while (resposta == 'n');
                    topoMenu = true;
                    break;
                case 4:
                    do {


                        System.out.print("Digite o Nome do livro: ");
                        sc.nextLine();
                        String nameLivro = sc.nextLine();
                        Livros encontraLivroName = list.stream().filter(x -> x.getName().equals(nameLivro)).findFirst().orElse(null);

                        if (encontraLivroName != null) {
                            System.out.println("Livro Encotrado");
                            System.out.print(encontraLivroName);
                        } else {
                            System.out.println("Livro não encontrado");
                        }
                        System.out.println("Deseja volta pro menu inicial [ s / n ]");
                        resposta = verificacao(sc);
                        Thread.sleep(1000);

                        LimpaTela.click();

                    } while (resposta == 'n');
                    topoMenu = true;
                    break;
                default:
                    System.out.println("Digitou um numero invalido;");
                    break;

            }
            if (topoMenu == true) {
                resposta = 's';
                topoMenu = false;
            } else {
                System.out.print("Voce quer continua [S/N]");
                resposta = verificacao(sc);
            }

        } while (resposta == 's');

        System.out.println(accountFuncionario.getName().toUpperCase() + " Blilbioteca Atendimento: ");
        List<AccountClient> accountClients = new ArrayList<>();

        /*System.out.println("Cadastro :");
        System.out.print("Nome:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Idade:");
        int idade = sc.nextInt();
        System.out.print("Endereço:");
        sc.nextLine();
        String endereco = sc.nextLine();*/
        accountClients.add(new AccountClient("Willian", 27, "Bruno Mordhost"));

        System.out.println("Digite 1 para alugar um livro");
        System.out.println("Digite 2 para Ver os livros");
        System.out.println("Digite 3 para ver sua divida");
        System.out.println("Digite 3 para Devolver o Livro");
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                mostraLivro(list);
                System.out.println("");

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Error 21: Numero digitado errrado");
                break;
        }

        //Selecionar o Cliente desejado
        AccountClient accountClientAtual = new AccountClient();
        for (AccountClient accountClient : accountClients) {
            accountClientAtual = accountClient;
        }


        sc.close();
    }

    // funcoes
    public static Livros cadastraLivro(Scanner sc) {

        System.out.println("Cadastro de Livros");
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        System.out.print("Numero ID: ");
        int id = sc.nextInt();

        return new Livros(nome, valor, id, autor);

    }


    public static void mostraLivro(List list) {
        int cont = 1;
        for (Object mostraLivros : list) {

            System.out.println("Livro " + cont);
            System.out.print(mostraLivros);
            cont++;
        }

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
