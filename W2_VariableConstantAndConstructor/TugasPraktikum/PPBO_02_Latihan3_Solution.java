// Nama :
// NIM  :
public class PPBO_02_Latihan3_Solution {
    String nim, nama, alamat;
    char jenisKelamin;

    /*
        Tulis kode kalian di sini
     */

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
    }
}

// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat
class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    Mahasiswa(String nim, String nama, char jenisKelamin, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }
}
