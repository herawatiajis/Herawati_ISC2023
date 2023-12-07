package isc;

import java.util.ArrayList;
import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        // Hari ke tigapuluh tujuh dari 100 hari
        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();

        System.out.print("Masukkan panjang array: ");
        int ukuran = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i <= ukuran) {
            System.out.print("Masukkan data: ");
            String isi = sc.nextLine();
            data.add(isi);
            i++;
        }
        System.out.println("Isi array: " + data);
        
        System.out.print("Masukkan indeks yang ingin dihapus: ");
        int indeksHapus = sc.nextInt();
        if (indeksHapus >= 0 && indeksHapus < data.size()) {
            data.remove(indeksHapus);
            System.out.println("Nilai pada indeks " + indeksHapus + " berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
        System.out.println("Isi array setelah penghapusan: " + data);
    }
    
}
