import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }

            if(x < 0 && y > 0){
                System.out.println("segundo");
            }

            if(x < 0 && y < 0){
                System.out.println("terceiro");
            }

            if(x > 0 && y < 0){
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();

    }
}
