package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <=n; i++) {
            System.out.printf("Product #%d data: \n", i);
            System.out.print("Common, used or imported? (c/u/i)? ");
            char productType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(productType == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if(productType == 'u'){
                System.out.print("Manufacture date: ");
                Date date = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, date));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
