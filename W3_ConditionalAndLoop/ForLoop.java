public class ForLoop 
{
    public static void main(String[] args) {
        int sum = 0, start = 0, end = 25;

        for(int i = start; i <= end; i++){
            if((i%2) == 1){
                sum += i;
            }
        }

        // ==> while loop yang menyerupai for loop
        // int j = start;
        // while(j < end){
        //     if((i%2) == 1){
        //         sum += i;
        //     }

        //     j++;
        // }

        System.out.println("Jumlah semua bilangan ganjil antara " + start + " dan " + end + " adalah " + sum);
    }
}

