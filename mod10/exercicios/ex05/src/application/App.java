package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double higherValue = 0.0;
        int positionHigherValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > higherValue){
                higherValue = numbers[i];
                positionHigherValue = i;
            }
        }

        System.out.printf("\n\nMAIOR VALOR = %.1f\n", higherValue);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", positionHigherValue);
        sc.close();

    }

}
