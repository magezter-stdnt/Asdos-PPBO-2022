import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleCatchesAndFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        System.out.println("Default x value: " + x);

        int[] arr = {1, 2, 3};
        System.out.println("Array elements: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();

        try {
            System.out.println("Change x value: ");
            x = scanner.nextInt();

            int index;
            System.out.println("Access array at index: ");
            index = scanner.nextInt();
            System.out.println("arr[" + index + "] = " + arr[index]);
            
        } catch (InputMismatchException e){
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        } finally {
            System.out.println("Exiting Try and Catch statement...");
            System.out.println("=====================");
        }

        System.out.println("Current x value: " + x);

        scanner.close();
    }
}
