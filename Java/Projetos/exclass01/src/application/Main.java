package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a largura e altura do retângulo: ");
        Rectangle rectangle = new Rectangle();
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();
        System.out.println(rectangle);

        sc.close();
    }
}
