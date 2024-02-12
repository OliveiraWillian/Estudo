package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char tag = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (tag == 'i') {
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customFee);
                list.add(product);

            } else if (tag == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date dataOrdem = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, dataOrdem);
                list.add(product);

            } else {
                Product product = new Product(name, price);
                list.add(product);

            }

        }
        System.out.println("PRICE TAGS:");
        for (Product product : list){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
