package application;

import entities.Triangulo;

import java.util.Scanner;

public class Progama {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Triangulo x,y ;
            x = new Triangulo();
            y = new Triangulo();

            x.a = 5;
            x.b = 3;
            x.c = 2;
            y.a = 1;
            y.b = 2;
            y.c = 3;

            y.axu =y.c * x.c;
            System.out.println(y.axu);

            sc.close();
        }

    }