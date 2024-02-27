package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));

        if(student.isApproved()){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING POINTS: " + String.format("%.2f", (60.0 - student.finalGrade())));
        }

        sc.close();
        
    }
}
