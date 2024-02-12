package application;

import unities.Client;
import unities.Order;
import unities.OrderItem;
import unities.Product;
import unities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String nameOrdem = sc.nextLine();
        System.out.print("Email: ");
        String emailOrdem = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date dataOrdem = sdf.parse(sc.next());

        Client client = new Client(nameOrdem,emailOrdem,dataOrdem);


        System.out.println("Enter order data: ");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(),status,client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.printf("Enter #0%d item data: \n",i);
            sc.nextLine();
            System.out.print("Product name:");
            String nomeProduct = sc.nextLine();

            System.out.print("Product price:");
            double priceProduct = sc.nextDouble();
            Product product = new Product(nomeProduct,priceProduct);

            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantityProduct,priceProduct,product);
            order.additem(orderItem);
        }

        System.out.println(order);

        sc.close();
    }

}
