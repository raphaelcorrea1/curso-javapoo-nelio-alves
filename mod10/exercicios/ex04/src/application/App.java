package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int qtdPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: "); 
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                qtdPares++;
            }

        }

        System.out.println("\nNUMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + "  ");
            }
        }

        System.out.print("\n\nQUANTIDADE DE PARES = " + qtdPares);

        sc.close();

    }
}
