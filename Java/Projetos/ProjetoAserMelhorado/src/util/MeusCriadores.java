package util;

import java.util.Scanner;

public class MeusCriadores {
    public static void desenvolvedores() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        int i = 0;
        String print1 = " ____________________________________ ";
        String print2 = "| Desenvolvido por Willian Oliveira, |";
        String print3 = "|                  & Marcio Play     |";
        String print4 = "|    Estudante da UNICESUMAR EAD     |";
        String print6 = "|    EM ANALISE E DESENVOLVIMENTO    |";
        String print7 = "|             DE SISTEMA             |";
        String print8 = "|____________________________________|";


        for (i = 0; i < 38; i++) {
            System.out.print(print1.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (i = 0; i < 38; i++) {
            System.out.print(print2.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (i = 0; i < 38; i++) {
            System.out.print(print3.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (i = 0; i < 38; i++) {
            System.out.print(print4.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        for (i = 0; i < 38; i++) {
            System.out.print(print6.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (i = 0; i < 38; i++) {
            System.out.print(print7.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (i = 0; i < 38; i++) {
            System.out.print(print8.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();






    }
}
