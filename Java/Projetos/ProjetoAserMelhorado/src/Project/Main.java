package Project;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import entities.enums.StatusConta;
import util.MeusCriadores;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int respMenu = 0;
        char respDelet;
        boolean deletaConta = true;

        Account contaEncontrada = null;
        GerenciaBanco gerenciaBanco = new GerenciaBanco();


        //MeusCriadores.desenvolvedores(); //Creditos do progama - Desativei por ser muito chato.
        boolean repeteBoolean = true;
        String adminsitracao = "LIVRE";
        System.out.println("Banco Play Oliveira");
        do {
            //Inicio verificação Login
            System.out.print("Digite o Numero da conta:");
            int loginConta = verificacaoInteger();
            System.out.print("Digite a senha: ");
            String senhaLogin = sc.nextLine();


            contaEncontrada = gerenciaBanco.login(loginConta);


            if (contaEncontrada != null && contaEncontrada.getStatusConta() == StatusConta.GERENTE) {
                if (contaEncontrada.getSenha().toLowerCase().equals(senhaLogin.toLowerCase())) {
                    System.out.println("Login Feito Com Sucesso ");
                    System.out.println("Bem-Vindo " + contaEncontrada.getName());
                    Thread.sleep(3000);

                    repeteBoolean = false;
                } else {
                    System.out.println("Senha Invalida");
                }
            } else if (contaEncontrada != null && contaEncontrada.getStatusConta() == StatusConta.FUNCIONARIO) {
                if (contaEncontrada.getSenha().toLowerCase().equals(senhaLogin.toLowerCase())) {
                    System.out.println("Login Feito Com Sucesso ");
                    System.out.println("Bem-Vindo " + contaEncontrada.getName());
                    Thread.sleep(3000);
                    repeteBoolean = false;
                } else {
                    System.out.println("Senha Invalida");
                }
            } else if (contaEncontrada != null && contaEncontrada.getStatusConta() == StatusConta.CLIENTE) {
                if (contaEncontrada.getSenha().toLowerCase().equals(senhaLogin.toLowerCase())) {
                    System.out.println("Login Feito Com Sucesso ");
                    System.out.println("Bem-Vindo " + contaEncontrada.getName());
                    Thread.sleep(3000);
                    repeteBoolean = false;
                } else {
                    System.out.println("Senha Invalida");
                }
            } else {
                System.out.println("Conta não encontrada");
            }

        } while (repeteBoolean);

        repeteBoolean = true;
//parte verificaologin Fim

        //Inicio Gerente
        if (contaEncontrada.getStatusConta() == StatusConta.GERENTE) {

            System.out.println("Espaço Gerente");

            do {
                System.out.println(
                        "[1]CADASTRAR NOVO FUNCIONARIO \n[2]CONSULTAR FUNCIONARIO \n[3]EXCLUIR CONTA\n[4]MOSTRAR TODOS OS FUNCIONARIO\n[5]ENCERRAR");
                System.out.print("Digite um numero: ");
                respMenu = verificacaoInteger();

                switch (respMenu) {
                    case 1:
                        System.out.print("NOME: ");

                        String name = sc.nextLine();


                        int conta = gerenciaBanco.encontraUltimoCadastro();


                        System.out.printf("CONTA: %d %n", conta);
                        System.out.print("Digite uma senha: ");
                        String senha = sc.nextLine(); // temos que melhorar esse capo pro usuario nao por espaço na senha.
                        gerenciaBanco.cadastraConta(name, conta, senha, StatusConta.FUNCIONARIO);

                        break;

                    case 2:
                        int pesq;
                        do {
                            System.out.println("[1]PESQUISA POR NOME:\n[2]PESQUISA POR CONTA: ");
                            System.out.print("Digite um Numero:");
                            pesq = verificacaoInteger();


                            if (pesq == 1) {
                                System.out.print("DIGITE O NOME: ");

                                String pesquisaName = sc.nextLine();
                                gerenciaBanco.consultaNome(pesquisaName, StatusConta.FUNCIONARIO);


                            } else if (pesq == 2) {
                                System.out.print("DIGITE A CONTA: ");
                                int pesquisaConta = verificacaoInteger();
                                gerenciaBanco.consultaConta(pesquisaConta, StatusConta.FUNCIONARIO);


                            } else {
                                System.out.println("Erro 2:Numero invalido");
                            }
                        } while (pesq != 1 && pesq != 2);
                        Thread.sleep(2000);
                        break;
                    case 3:
                        Account deletarConta = null;
                        do {

                            do {
                                System.out.println("[1]PESQUISA POR NOME :\n[2]PESQUISA POR CONTA: ");
                                System.out.print("Digite um Numero:");
                                pesq = verificacaoInteger();
                                if (pesq == 1) {
                                    System.out.print("DIGITE O NOME: ");

                                    String pesquisaName = sc.nextLine();
                                    deletarConta = gerenciaBanco.consultaNome(pesquisaName, StatusConta.FUNCIONARIO);


                                } else if (pesq == 2) {
                                    System.out.print("DIGITE A CONTA: ");
                                    int pesquisaConta = verificacaoInteger();
                                    deletarConta = gerenciaBanco.consultaConta(pesquisaConta, StatusConta.FUNCIONARIO);

                                } else {
                                    System.out.println("Erro 3:Numero invalido");
                                }
                            } while (pesq != 1 && pesq != 2);
                            Thread.sleep(1500);
                            if (deletarConta != null) {
                                System.out.println("TEM CERTEZA QUE DESEJA EXCLUIR ESSA CONTA [S/N]: ");

                                char resp = verificacao(sc);
                                if (resp == 's' || resp == 'S') {
                                    if (deletarConta != null) {
                                        gerenciaBanco.removerConta(deletarConta);
                                    }

                                }
                            }
                            deletaConta = true;
                            if (gerenciaBanco.mostraListaConta(StatusConta.FUNCIONARIO, true) == false) {
                                respDelet = 'n';
                            } else {
                                System.out.println("QUER EXCLUIR OUTRA CONTA(s/n): ");
                                respDelet = verificacao(sc);
                            }

                        } while (respDelet == 's');
                        sc.nextLine();
                        break;

                    case 4:
                        deletaConta = false;
                        if (!gerenciaBanco.mostraListaConta(StatusConta.FUNCIONARIO, deletaConta)) {
                            System.out.println("Nenhuma Conta encontrado");
                        }

                        break;
                    default:
                        System.out.println("Voce Digitou um numero invalido");
                        break;
                }
            } while (respMenu != 5);
        }        // Fim Gerente


// Inicio Funcionario
        if (contaEncontrada.getStatusConta() == StatusConta.FUNCIONARIO) {

            System.out.println("Espaço FUNCIONARIO");

            do {
                System.out.println(
                        "[1]CADASTRAR NOVO CLIENTE \n[2]CONSULTAR CLIENTE \n[3]EXCLUIR CONTA\n[4]MOSTRAR TODOS OS CLIENTES\n[5]ENCERRAR");
                System.out.print("Digite um numero: ");
                respMenu = verificacaoInteger();

                switch (respMenu) {
                    case 1:
                        System.out.print("NOME: ");

                        String name = sc.nextLine();


                        int conta = gerenciaBanco.encontraUltimoCadastro();


                        System.out.printf("CONTA: %d %n", conta);
                        System.out.print("Digite uma senha: ");
                        String senha = sc.nextLine(); // temos que melhorar esse capo pro usuario nao por espaço na senha.

                        System.out.print("DEPOSITO INICIAL [S/N]:");
                        char r = verificacao(sc);

                        if (r == 's' || r == 'S') {
                            System.out.print("VALOR DO DEPOSITO: ");
                            double depositoInicial = verificacaoDouble();
                            while (depositoInicial <= 0) {
                                System.out.print("Erro deposito 0523 \nDigite um Valor valido para deposito: ");
                                depositoInicial = verificacaoDouble();

                            }

                            gerenciaBanco.cadastraContaDeposito(name, conta, senha, depositoInicial, StatusConta.CLIENTE);
                        } else {
                            gerenciaBanco.cadastraConta(name, conta, senha, StatusConta.CLIENTE);
                        }


                        break;

                    case 2:
                        int pesq;
                        do {
                            System.out.println("[1]PESQUISA POR NOME:\n[2]PESQUISA POR CONTA: ");
                            System.out.print("Digite um Numero:");
                            pesq = verificacaoInteger();


                            if (pesq == 1) {
                                System.out.print("DIGITE O NOME: ");

                                String pesquisaName = sc.nextLine();
                                gerenciaBanco.consultaNome(pesquisaName, StatusConta.CLIENTE);


                            } else if (pesq == 2) {
                                System.out.print("DIGITE A CONTA: ");
                                int pesquisaConta = verificacaoInteger();
                                gerenciaBanco.consultaConta(pesquisaConta, StatusConta.CLIENTE);


                            } else {
                                System.out.println("Erro 2:Numero invalido");
                            }
                        } while (pesq != 1 && pesq != 2);
                        Thread.sleep(2000);
                        break;
                    case 3:
                        Account deletarConta = null;
                        do {

                            do {
                                System.out.println("[1]PESQUISA POR NOME :\n[2]PESQUISA POR CONTA: ");
                                System.out.print("Digite um Numero:");
                                pesq = verificacaoInteger();
                                if (pesq == 1) {
                                    System.out.print("DIGITE O NOME: ");

                                    String pesquisaName = sc.nextLine();
                                    deletarConta = gerenciaBanco.consultaNome(pesquisaName, StatusConta.CLIENTE);


                                } else if (pesq == 2) {
                                    System.out.print("DIGITE A CONTA: ");
                                    int pesquisaConta = verificacaoInteger();
                                    deletarConta = gerenciaBanco.consultaConta(pesquisaConta, StatusConta.CLIENTE);

                                } else {
                                    System.out.println("Erro 3:Numero invalido");
                                }
                            } while (pesq != 1 && pesq != 2);
                            Thread.sleep(1500);
                            if (deletarConta != null) {
                                System.out.println("TEM CERTEZA QUE DESEJA EXCLUIR ESSA CONTA [S/N]: ");

                                char resp = verificacao(sc);
                                if (resp == 's' || resp == 'S') {
                                    if (deletarConta != null) {
                                        gerenciaBanco.removerConta(deletarConta);
                                    }

                                }
                            }
                            deletaConta = true;
                            if (gerenciaBanco.mostraListaConta(StatusConta.CLIENTE, deletaConta) == false) {
                                respDelet = 'n';
                            } else {
                                System.out.println("QUER EXCLUIR OUTRA CONTA(s/n): ");
                                respDelet = verificacao(sc);
                            }

                        } while (respDelet == 's');
                        sc.nextLine();
                        break;

                    case 4:
                        deletaConta = false;
                        if (!gerenciaBanco.mostraListaConta(StatusConta.CLIENTE, deletaConta)) {
                            System.out.println("Nenhuma Conta encontrado");
                        }

                        break;
                    default:
                        System.out.println("Voce Digitou um numero invalido");
                        break;
                }
            } while (respMenu != 5);
        }
//Fim Funcionarop


//Inciio Cliente
        if (contaEncontrada.getStatusConta() == StatusConta.CLIENTE) {
            System.out.println("Espaço Cliente");

            do {
                System.out.println("[1] Digite um para saque");
                System.out.println("[2] Digite um para Deposita");
                System.out.println("[3] Digite um para Transferencia");
                System.out.println("[4] Digite um para Pagar Conta");
                System.out.println("[5] Digite um para Emprestimos");

                int n = verificacaoInteger();
                AccountClient accountClient = (AccountClient) contaEncontrada; //Polimofismo + casting
                switch (n) {
                    case 1:
                        if (contaEncontrada != null) {
                            System.out.print("Digite o Valor que deseja sacar: ");
                            double saque = verificacaoDouble();
                            if (saque < accountClient.getSaldo()) {
                                accountClient.saque(saque);
                            } else {
                                System.out.println("Voce não tem saldo Suficiente");
                            }


                            System.out.println("Saldo: " + accountClient.getSaldo());
                        }
                        break;
                    case 2:
                        if (contaEncontrada != null) {
                            System.out.print("Digite o Valor que deseja Depositar: ");
                            accountClient.deposito(verificacaoDouble());
                            System.out.println("Saldo: " + accountClient.getSaldo());

                        } else {
                            System.out.println("Erro 20: Deposito");
                        }

                        break;
                    case 5:
                        if (contaEncontrada != null) {
                            System.out.print("Digite o Valor que você precisa de emprestimo: ");
                            accountClient.empresimo(verificacaoDouble());
                        }
                }
            } while (respMenu != 5);
        }
        //Fim Cliente

        sc.close();

    }

    public static char verificacao(Scanner sc) {
        char ch2;
        int cont = 0;
        do {
            if (cont == 0) {
                ch2 = sc.next().toLowerCase().charAt(0);
            } else {
                System.out.println("Erro 5: Digite somente [s/n]");
                ch2 = sc.next().toLowerCase().charAt(0);
            }
            cont++;
        } while (ch2 != 's' && ch2 != 'n');
        return ch2;
    }

    public static int verificacaoInteger() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {

                n = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.print("Por favor, digite apenas números: ");
                sc.next(); // descarta a entrada inválida
            }
        }

        return n;

    }

    public static double verificacaoDouble() {
        Scanner sc = new Scanner(System.in);
        double n = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {

                n = sc.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.print("Por favor, digite apenas números: ");
                sc.next(); // descarta a entrada inválida
            }
        }

        return n;

    }


}

