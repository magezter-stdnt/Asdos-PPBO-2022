import java.util.Scanner;

public class Scan2 {
	public static void main(String[] args){
        int nnames;
        String names[];
        
        System.out.print("Masukkan jumlah orang: ");
        Scanner sc = new Scanner(System.in);

        // nnames = sc.nextInt();
        // names = new String[nnames];
        // sc.nextLine();


        nnames = Integer.parseInt(sc.nextLine());
        names = new String[nnames];



        for (int i = 0; i < names.length; i++){
          System.out.print("Nama orang ke-" + (i+1) + ": ");
          names[i] = sc.nextLine();
        }

        System.out.println("===================================");

        for (int i = 0; i < names.length; i++){
          System.out.println("Nama orang ke-" + (i+1) + ": " + names[i]);
        }

        sc.close();
	}
}
