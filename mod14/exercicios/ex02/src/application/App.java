package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or company (i/c)? ");
            char personType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(personType == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberofEmployees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, numberofEmployees));
            }
        }

        double totalTaxes = 0;

        System.out.println("\nTAXES PAID: ");
        for (TaxPayer taxPayer : taxPayers) {
            totalTaxes += taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
