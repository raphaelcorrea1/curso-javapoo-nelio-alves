package application;

import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person[] person = new Person[n];

        for (int i = 0; i < person.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa\n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            person[i] = new Person(name, age);    
        }

        int olderAge = person[0].getAge();
        int olderAgePosition = 0;

        for (int i = 0; i < person.length; i++) {
            if(person[i].getAge() > olderAge){
                olderAge = person[i].getAge();
                olderAgePosition = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", person[olderAgePosition].getName());

        sc.close();
    }
}
