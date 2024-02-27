import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            float div = (float) a/b;
            if(b==0){
                System.out.println("divisão impossível");
                continue;
            }
            System.out.printf("%.1f%n", div);
        }

        sc.close();
    }
}
