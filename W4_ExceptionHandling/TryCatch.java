import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        System.out.println("Default x value: " + x);

        try {
            System.out.println("Change x value: ");
            x = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Mismatched input type");
        }

        System.out.println("Current x value: " + x);

        scanner.close();

    }
}
