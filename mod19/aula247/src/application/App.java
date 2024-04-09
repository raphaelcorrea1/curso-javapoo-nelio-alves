package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int qtd = sc.nextInt();
        for(int i = 0; i<qtd; i++){
            courseA.add(sc.nextInt());
        }
        System.out.print("How many students for course B? ");
        qtd = sc.nextInt();
        for(int i = 0; i<qtd; i++){
            courseB.add(sc.nextInt());
        }
        System.out.print("How many students for course C? ");
        qtd = sc.nextInt();
        for(int i = 0; i<qtd; i++){
            courseC.add(sc.nextInt());
        }

        Set<Integer> totalStudents = new HashSet<>(courseA);
        totalStudents.addAll(courseB);
        totalStudents.addAll(courseC);

        System.out.println("Total students: " + totalStudents.size());

        sc.close();

    }
}
