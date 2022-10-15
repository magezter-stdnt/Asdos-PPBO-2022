// Nama :
// NIM  :
public class PPBO_02_Latihan2_Solution {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban :    Percobaan untuk mengubah nilai konstanta KURS_DOLLAR pada baris ke 8 
//              yang mana seharusnya tidak bisa diubah karena konstanta bersifat final
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban :    keyword static digunakan untuk membuat sebuah member atau method dapat digunakan
//              pada setiap instance dari class tersebut dan jika sebuah member maka nilainya 
//              selalu sama
