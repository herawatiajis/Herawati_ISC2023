package isc;

import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        // Hari ke 53 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            double angka = scanner.nextDouble();
            total += angka;
        }

        double rataRata = total / jumlahAngka;
        System.out.println("Nilai rata-rata adalah: " + rataRata);

    }
    
}
