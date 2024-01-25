package application;

import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Digite o valor da largura: ");
        rectangle.largura = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        rectangle.altura = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();

    }
}
