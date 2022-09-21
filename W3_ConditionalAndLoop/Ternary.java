public class Ternary {
    public static void main(String[] args) {
        int score = 70;
        char grade = (score > 33) ? ((score > 66) ? 'A' : 'B' ): 'C';
        System.out.println(grade);
    }
}
