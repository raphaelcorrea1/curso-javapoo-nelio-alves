import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int code_p1, code_p2, amount_p1, amount_p2;
        double unit_value_p1, unit_value_p2, total_pay;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        code_p1 = sc.nextInt();
        amount_p1 = sc.nextInt();
        unit_value_p1 = sc.nextDouble();

        code_p2 = sc.nextInt();
        amount_p2 = sc.nextInt();
        unit_value_p2 = sc.nextDouble();

        total_pay = (amount_p1 * unit_value_p1) + (amount_p2 * unit_value_p2);

        System.out.printf("VALOR A PAGAR = R$ %.2f", total_pay);

        sc.close();

    }
}
