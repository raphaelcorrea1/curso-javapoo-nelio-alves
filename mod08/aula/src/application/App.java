package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");;
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("X area: %d%n", areaX);
        System.out.printf("Y area: %d%n", areaY);

        if(areaX > areaY) {
            System.out.println("The largest area is: X");
        } else {
            System.out.println("The largest area is: Y");
        }
        sc.close();
}

}
