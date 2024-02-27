import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a, b, c, d, dif_produto;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        dif_produto = ((a*b) - (c*d));

        System.out.println("DIFERENCA = " + dif_produto);

        sc.close();
    }
}
