import entities.Triangulo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        //x
        System.out.println("Digite o valor do lado X: ");
        x.a = sc.nextDouble();
        System.out.println("Digite um novo valor do lado: ");

        x.b = sc.nextDouble();
        System.out.println("Digite um novo valor do lado: ");

        x.c = sc.nextDouble();
        //y
        System.out.println("Digite o valor do lado Y: ");

        y.a = sc.nextDouble();
        System.out.println("Digite um novo valor do lado: ");

        y.b = sc.nextDouble();
        System.out.println("Digite um novo valor do lado: ");

        y.c = sc.nextDouble();


        double xarea = x.area(x.a, x.b, x.c);
        double yarea = y.area(y.a, y.b, y.c);

        System.out.printf("Triangle X area: %.2f %n", xarea);
        System.out.printf("Triangle Y area: %.2f %n", yarea);
        System.out.print("Larger area: ");
        Triangulo.max(xarea, yarea);

    }


}