package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        double sum = 0.0;
        int numbersPar = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
                numbersPar++;
            }
        }

        double avg = sum/numbersPar;

        if(sum == 0) {
            System.out.println("NENUM NUMERO PAR");
            sc.close();
            return;
        }

        System.out.printf("MEDIA DOS PARES = %.1f", avg);
        sc.close();
    }
}
