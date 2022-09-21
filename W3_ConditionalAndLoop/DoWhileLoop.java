import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer;
        do {
            System.out.print("Masukkan bilangan negatif: ");
            answer = scanner.nextInt();
        } while(answer > 0);

        System.out.println("Input: " + answer);

        scanner.close();
    }
}
