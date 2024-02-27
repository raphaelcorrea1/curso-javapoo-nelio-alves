import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int x, y;
        String z;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        sc.nextLine();
        z = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);

        sc.close();
    }
}
