package isc;

import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        // Hari ke 52 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        int angkaTerbesar = 0;

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = scanner.nextInt();


            if (angka > angkaTerbesar) {
                angkaTerbesar = angka;
            }
        }
        System.out.println("Angka terbesar adalah: " + angkaTerbesar);

    }
    
}
