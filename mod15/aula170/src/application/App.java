package application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();

        try {
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position: ");
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        System.out.println("End of program");

        sc.close();
    }
}
