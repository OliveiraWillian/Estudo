package application;

import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Nome");
        student.name = sc.nextLine();
        student.primeiroTrimestre(sc.nextDouble());

        sc.close();
    }
}
