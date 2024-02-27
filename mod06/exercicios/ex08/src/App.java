import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        while(senha != 2002){
            senha = sc.nextInt();
            if(senha == 2002){
                System.out.println("Acesso permitido");
                break;
            } else{
                System.out.println("Acesso negado");
            }
        }

        sc.close();
    }
}
