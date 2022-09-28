import java.util.Scanner;

public class StringMethodLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "";
        do{
            System.out.println("Insert a username (should be more than 5 characters): ");
            username = scanner.nextLine();
        } while(username.length() < 5);

        System.out.println("Your username is " + username);

        scanner.close();
    }
}
