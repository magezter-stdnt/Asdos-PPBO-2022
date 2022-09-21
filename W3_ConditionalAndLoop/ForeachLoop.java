public class ForeachLoop {
    public static void main(String[] args) {
        int[] perfectSquares = {1, 4, 9, 16, 25};

        System.out.println("Bilangan kuadrat sempurna dari 0 sampai 25: ");
        for(int x : perfectSquares){
            System.out.print(x + " ");
        }
    }
}
