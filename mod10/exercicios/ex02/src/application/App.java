package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();

        double[] nums = new double[qtd];

        for(int i = 0; i<nums.length; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            nums[i] += num;
        }

        double sum = 0;
        
        System.out.print("\nVALORES = ");
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + "  ");
        }

        for(int i =0; i<nums.length;i++){
            sum += nums[i];
        }

        double avg = sum/nums.length;

        System.out.printf("\nSOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f", avg);

        sc.close();
    }
}
