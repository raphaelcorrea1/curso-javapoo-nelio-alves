package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        Client client = new Client(name, email, date);

        OrderItem item = new OrderItem();
        Product product = new Product();
        Order order = new Order();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        order = new Order(new Date(), status, client);
        int qtdItems = sc.nextInt();

        for (int i = 1; i <= qtdItems; i++) {
            sc.nextLine();
            System.out.printf("Enter #%d item data: \n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            product = new Product(productName, productPrice);
            item = new OrderItem(productQuantity, productPrice, product);
            order.addItem(item);
        }
        
        System.out.println("\n" + order);

        sc.close();
    }
}
