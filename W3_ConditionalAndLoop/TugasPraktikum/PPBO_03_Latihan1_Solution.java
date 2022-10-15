// Nama :  
// NIM  :

import java.util.Scanner;

public class PPBO_03_Latihan1_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        int totalPembelian = sc.nextInt();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        float discountMultiplier;
        if(totalPembelian <= 50000){
            discountMultiplier = 0f;
        } else if(totalPembelian <= 75000){
            discountMultiplier = 0.05f;
        } else if(totalPembelian <= 125000){
            discountMultiplier = 0.15f;
        } else {
            discountMultiplier = 0.2f;
        }
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        float discountedTotalPembelian = totalPembelian * (1 - discountMultiplier);
        System.out.println("Total pembelian setelah diskon: ");
        System.out.println(discountedTotalPembelian);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000