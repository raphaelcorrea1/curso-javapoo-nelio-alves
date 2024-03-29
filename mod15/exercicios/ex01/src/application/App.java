package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, name, initialBalance, withdrawLimit);            
        System.out.print("\nEnter amount for withdraw: ");
        double withdraw = sc.nextDouble();

        try {
            account.withdraw(withdraw);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } 
        
        catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());

        }
        
        catch (RuntimeException e) {
            System.out.println("Unexpected error");

        }

        finally{
            sc.close();
        }

    }
}
