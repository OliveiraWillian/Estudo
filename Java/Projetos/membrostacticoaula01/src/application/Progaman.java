package application;

import ultil.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Progaman {



    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference: " + Calculator.circumference(radius));


        System.out.println("Volume: " + Calculator.volume(radius)  );

        System.out.println("PI Value: "+ Calculator.PI);

        sc.close();
    }
}
