// Nama :  
// NIM  :

public class PPBO_03_Latihan3_Solution {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:   Penulisan kode perulangan tersebut salah. Index array dimulai dari 0 bukan 1, yang mana 
//          pada sourcecode ditulis "int i = 1; i < 6; i++" yang mengakibatkan perulangan akan mengakses
//          index 1 sampai 5, padahal array hanya memiliki index 0 sampai 4. 
//          Revisi kode tersebut adalah mengganti isi for loop menjadi "int i = 0; i < 5; i++"