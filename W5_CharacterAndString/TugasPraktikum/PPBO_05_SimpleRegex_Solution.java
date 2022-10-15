import java.util.Scanner;

public class PPBO_05_SimpleRegex_Solution {
    
    static int MatchType(String str){
        if(str.matches("[aiueoAIUEO]\\w*")){
            return 1;
        } else if(str.matches("\\w*ng")){
            return 2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while(input != "-1"){
            System.out.println("Masukkan string: ");
            input = scanner.nextLine();
            System.out.println(MatchType(input));
        }

        scanner.close();
    }
}


