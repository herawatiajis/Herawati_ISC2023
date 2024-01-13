package isc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class day97 {
    public static void main(String[] args) {
        // Hari ke 96 dari 100 hari
        List<String> daftarNama = new ArrayList<>();
        daftarNama.add("Hera");
        daftarNama.add("Wajida");
        daftarNama.add("Hana");

        System.out.println("Daftar Nama:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan indeks nama yang ingin ditampilkan: ");
            int indeks = scanner.nextInt();

            String namaTerpilih = daftarNama.get(indeks);
            System.out.println("Nama terpilih: " + namaTerpilih);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks tidak valid. Program akan keluar.");
        } 
    }
    
}
