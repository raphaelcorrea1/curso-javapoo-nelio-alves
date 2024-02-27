import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio, area;
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        raio = sc.nextFloat();

        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);

        sc.close();

    }
}
