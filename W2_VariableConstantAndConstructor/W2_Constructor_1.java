public class W2_Constructor_1 {
    public static void main(String[] args) {
        Karyawan kar =  new Karyawan("123", "Aaron", "IT", 32.09);
        kar.ShowInfo();
    }
}

class Karyawan {
    String ID, nama, divisi;
    double gaji;

    Karyawan(String ID, String nama, String divisi, double gaji) 
    {
        this.ID = ID;
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji;
    }

    void ShowInfo()
    {
        System.out.println("ID: " + this.ID);
        System.out.println("nama: " + this.nama);
        System.out.println("divisi: " + this.divisi);
        System.out.println("gaji: " + this.gaji);
    }
}

