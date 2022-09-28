import java.util.Scanner;

public class StringMethodSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "";
        String prefix = "IFUNS_";
        int prefixLength = prefix.length();
        String checkPrefix = "";
        
        do{
            // System.out.println("Create a file name (should prefixxed with \"" + prefix + "\": ");
            System.out.println(
                String.format("Create a file name (should be prefixed with \"%s\"): ", prefix)
            );
            fileName = scanner.nextLine();

            if(fileName.length() < prefixLength){
                continue;
            } else {
                checkPrefix = fileName.substring(0,prefixLength);
            }
        } while(!checkPrefix.equals(prefix));

        System.out.println("Your file name is " + fileName);

        scanner.close();
    }
}
