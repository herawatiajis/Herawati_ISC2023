package isc;

import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        // Hari ke 75 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        int angkaTerkecil = 100;

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = scanner.nextInt();


            if (angka < angkaTerkecil) {
                angkaTerkecil = angka;
            }
        }
        System.out.println("Angka terkecil adalah: " + angkaTerkecil);
    }
    
}
