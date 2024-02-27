package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        double initialDeposit = 0;

        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        Account account = new Account(accountNumber, accountHolder, initialDeposit);

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
