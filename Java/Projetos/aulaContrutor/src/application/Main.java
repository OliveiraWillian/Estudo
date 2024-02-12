package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name,price);

        System.out.print("Quantity in stock: ");
        product.addProducts(sc.nextInt());

        System.out.print("Product" + product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.print("Updated" + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.print("Removed" + product);


        sc.close();


    }
}
