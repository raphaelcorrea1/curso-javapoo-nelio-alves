import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number_func, time_working;
        double salary, amount_per_hour;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        number_func = sc.nextInt();
        time_working = sc.nextInt();
        amount_per_hour = sc.nextDouble();

        salary = amount_per_hour * time_working;

        System.out.println("NUMBER = " + number_func);
        System.out.println("SALARY = U$ " + salary);

        sc.close();

        
    }
}
