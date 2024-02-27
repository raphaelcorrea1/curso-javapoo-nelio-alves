package application;

import java.util.Scanner;

import entities.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] rent = new Rent[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nRent #%d:\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomN = sc.nextInt();
            rent[roomN] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < rent.length; i++) {
            if(rent[i] != null){
                System.out.printf("%d: %s, %s\n", i, rent[i].getName(), rent[i].getEmail());
            }
        }            
        
        sc.close();

    }
}
