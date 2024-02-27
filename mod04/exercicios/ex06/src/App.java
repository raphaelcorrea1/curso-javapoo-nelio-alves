import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a, b, c, area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
        final double PI = 3.14159;
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        area_triangulo = (a*c) / 2;
        area_circulo = PI * Math.pow(c, 2);
        area_trapezio = ((a+b) * c) / 2;
        area_quadrado = b*b;
        area_retangulo = a*b;

        System.out.printf("TRIANGULO = %.3f%n", area_triangulo);
        System.out.printf("CIRCULO = %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO = %.3f%n", area_trapezio);
        System.out.printf("QUADRADO = %.3f%n", area_quadrado);
        System.out.printf("RETANGULO = %.3f%n", area_retangulo);

        sc.close();
        
    }
}
