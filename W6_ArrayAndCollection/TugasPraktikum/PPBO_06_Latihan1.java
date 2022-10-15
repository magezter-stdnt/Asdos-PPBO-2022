public class PPBO_06_Latihan1 {
public static void main(String[] args) {
    Kelas[] kelas = new Kelas[10];
    
    for (int i = 0; i < kelas.length; i++){
        kelas[i] = new Kelas();

        System.out.println("Kelas " + kelas[i].namaKelas);
        
        for (int j = 0; j < kelas[i].mahasiswa.length; j++){
            System.out.print(" " + kelas[i].mahasiswa[j].nim);
            
        }

        System.out.println();
        // persons[i].printPerson(;
    }
}
}
