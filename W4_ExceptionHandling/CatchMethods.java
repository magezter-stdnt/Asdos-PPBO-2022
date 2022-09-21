import java.util.Scanner;
import java.util.InputMismatchException;

public class CatchMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        try {
            System.out.println("insert integer value: ");
            x = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("information from getMessage(): " + e.getMessage());
            System.out.println("information from toString(): " + e.toString());
            System.out.println("information from printStackTrace(): ");
            e.printStackTrace();
        }
        System.out.println("x: " + x);
        
        scanner.close();
    }
}
