import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        int alcool;
        int gasolina;
        int diesel;
        alcool = gasolina = diesel = 0;

        while(codigo != 4){
            if(codigo == 1){
                alcool++;
            }       
            
            if(codigo == 2){
                gasolina++;
            }

            if(codigo == 3){
                diesel++;
            }

            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

        sc.close();
    }
}
