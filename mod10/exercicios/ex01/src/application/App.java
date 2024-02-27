package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();

        int[] numbers = new int[qtd];

        for(int i =0; i<numbers.length; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numbers[i] += num;
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
