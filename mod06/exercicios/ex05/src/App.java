import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        for(int i=1;i<=n;i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}
