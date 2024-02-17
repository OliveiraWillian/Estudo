package entities;

import java.util.ArrayList;
import java.util.List;


import entities.enums.StatusConta;

public class GerenciaBanco {




    protected List<Account> contas = new ArrayList<>();


    public GerenciaBanco() {
        contas.add(new AccountMestre("Marcio Play", 101, "123456"));
        contas.add(new AccountMestre("Willian Oliveira", 102, "123456"));
        contas.add(new AccountFuncionario("Moraes Aparecida", 103, "123456"));
        contas.add(new AccountClient("Nicole Bernadet", 104, "123456", 500));
        contas.add(new AccountClient("Carlos Perreira", 105, "123456", 100));
        contas.add(new AccountClient("Jose Pinto", 106, "123456"));
    }

    public int tamanhoLista() {
        return contas.size();
    }

    public int reoganizar() {
        int max = 0;
        for (Account conta : contas) {

            if (conta.getConta() > max) {
                max = conta.getConta();
            }
        }
        return max;

    }

    public Account login(int conta) {
        boolean contaBoolean = false;

        Account retornoConta = null;
        for (Account encontraConta : contas) {
            if (encontraConta.getConta() == conta) {
                contaBoolean = true;
            }

            if (contaBoolean) {
                retornoConta = encontraConta;
                contaBoolean = false;

            }
        }
        return retornoConta;


    }

    public int encontraUltimoCadastro() {


        int max = 0;

        if (contas.size() == 0) {
            max = 101;
        } else {
            max = (reoganizar() + 1);
        }


        return max;


    }

    public void cadastraConta(String name, int conta, String senha, Enum statosConta) {
        if (statosConta == StatusConta.GERENTE) {
            contas.add(new AccountMestre(name, conta, senha));
        } else if (statosConta == StatusConta.FUNCIONARIO) {
            contas.add(new AccountFuncionario(name, conta, senha));
        } else if (statosConta == StatusConta.CLIENTE) {
            contas.add(new AccountClient(name, conta, senha));
        }
    }

    public void cadastraContaDeposito(String name, int conta, String senha, double deposito, Enum statosConta) {
        if (statosConta == StatusConta.CLIENTE) {
            contas.add(new AccountClient(name, conta, senha,deposito));
        }
    }

    public void removerConta(Account deletaConta) {
        contas.remove(deletaConta);

    }


    public Account consultaNome(String nome, Enum status) {
        Account encontrarConta = contas.stream().filter(x -> x.getName().toLowerCase().equals(nome.toLowerCase()) && x.getStatusConta() == status).findFirst().orElse(null);

        if (encontrarConta != null) {
            System.out.println(encontrarConta);
        }
        if (encontrarConta == null) {
            System.out.println("CLIENTE NÃO ENCONTRADO!");
        }
        return encontrarConta;
    }

    public Account consultaConta(int conta, Enum status) {
        Account encontrarConta = contas.stream().filter(x -> x.getConta() == conta && x.getStatusConta() == status).findFirst().orElse(null);

        if (encontrarConta != null) {
            System.out.println(encontrarConta);
        }
        if (encontrarConta == null) {
            System.out.println("CLIENTE NÃO ENCONTRADO!");
        }
        return encontrarConta;
    }

    public boolean mostraListaConta(Enum status, boolean deletaConta) throws InterruptedException {
        boolean cont = false;
        boolean apagarCont = deletaConta;
        for (Account mostraListra : contas) {
            if (mostraListra.statusConta == status) {
                if(!apagarCont) {
                    System.out.println(mostraListra);
                }
                cont = true;
            }
        }

        Thread.sleep(2000);
        return cont;
    }


}
