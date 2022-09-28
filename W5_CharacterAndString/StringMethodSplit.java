import java.util.Scanner;

public class StringMethodSplit {
    static int CountWordsInSentence(String sentence){
        var words = sentence.split(" ");
        return words.length;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String sentence = "";
        System.out.println("Insert a sentence: ");
        sentence = scanner.nextLine();


        System.out.println(
            "The sentence contains " +
            CountWordsInSentence(sentence) +
            " words!"
        );
        scanner.close();
    }
}


