package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name:");
        student.name = sc.nextLine();

        do {
        System.out.print("Nota 1: ");

            student.n1 = sc.nextDouble();
        }while (student.n1 < 0 || student.n1 > 30 );

        do {
            System.out.print("Nota 2: ");

            student.n2 = sc.nextDouble();
        }while (student.n2 < 0 || student.n2 > 35 );


        do {
            System.out.print("Nota 3: ");

            student.n3 = sc.nextDouble();
        }while (student.n3 < 0 || student.n3 > 35 );


        System.out.println(student);

        sc.close();
    }
}
