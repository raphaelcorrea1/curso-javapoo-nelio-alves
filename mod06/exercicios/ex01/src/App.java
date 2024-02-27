import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x, i;

        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        sc.close();
        if(x < 1 || x > 1000){
            System.out.println("ERRO");
            return;
        }
        
        for(i=0;i<=x;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
