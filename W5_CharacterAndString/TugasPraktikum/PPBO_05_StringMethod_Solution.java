import java.util.Scanner;

public class PPBO_05_StringMethod_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a sentence: ");
        String input = scanner.nextLine();
        var inputArr = input.toCharArray();
        String result = "";
        for(int i=0; i<inputArr.length; i++){
            if(i%3==0){
                result+=inputArr[i];
            }
        }

        System.out.println(result);


        scanner.close();
    }
}
