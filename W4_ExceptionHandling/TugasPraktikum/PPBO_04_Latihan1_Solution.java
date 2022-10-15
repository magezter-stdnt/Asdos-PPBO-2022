// Nama :
// NIM  :

import java.util.Scanner;

public class PPBO_04_Latihan1_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        // double hasil = bil1/ bil2;
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB : output ialah sebuah exception InputMismatchException di mana execption tersebut muncul karena
            user mencoba mengisi variabel bertipe integer dengan character

*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB : output ialah Infinity. Namun, jika tidak menggunakan method Double.valueOf(), output berpotensi 
            memunculkan exception ArithmeticException dikarenakan user melakukan 
            pembagian floating poin dengan 0

*/