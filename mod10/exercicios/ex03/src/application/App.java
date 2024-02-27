package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Person[] person = new Person[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            person[i] = new Person(name, age, height);
        }

        double sumHeight = 0;
        int personMinorSixteen = 0;

        for (int i = 0; i < person.length; i++) {
            sumHeight += person[i].getHeight();
            if(person[i].getAge() < 16){
                personMinorSixteen++;
            }
        }

        double avgHeight = sumHeight / person.length;
        double percentMinors = ((double)personMinorSixteen / n) * 100.0;

        System.out.printf("Altura média: %.2f\n", avgHeight);
        System.out.print("Pessoas com menos de 16 anos: " + percentMinors + "%\n");

        for (int i = 0; i < person.length; i++) {
            if(person[i].getAge() < 16){
                System.out.println(person[i].getName());
            }
        }

        sc.close();

    }
}
