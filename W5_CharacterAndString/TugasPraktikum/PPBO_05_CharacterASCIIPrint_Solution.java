// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner; // import the Scanner class 

class PPBO_05_CharacterASCIIPrint_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b;
        int low=0, high=0;
        
        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        
        int[] arr = new int[Math.abs((int)a-(int)b)+1];
        
        if((int)a < (int)b){
            low = (int)a;
            high = (int)b;
            insertArray(arr, low, high);
        }
        else if((int)a > (int)b){
            low = (int)b;
            high = (int)a;
            insertArray(arr, low, high);

        }
        else{
            arr[0] = (int)a;
        }
        
        printArray(arr);
        sc.close();
    }

    static void insertArray(int[] arr, int low, int high){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = low+i;
        }
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char)arr[i]);
        }
    }
}

