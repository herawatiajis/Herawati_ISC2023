package isc;

import java.util.Random;
import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        // Hari ke 86 dari 100 hari
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Permainan Dadu ===");

        System.out.print("Tebak angka dari 1-6: ");
        int tebakanPengguna = scanner.nextInt();

        int hasilDadu = random.nextInt(6) + 1;

        if (tebakanPengguna >= 1 && tebakanPengguna <= 6) {
            System.out.println("Hasil lemparan dadu: " + hasilDadu);

            if (tebakanPengguna == hasilDadu) {
                System.out.println("Selamat! Tebakan benar.");
            } else {
                System.out.println("Maaf, tebakan salah. Coba lagi.");
            }
        } else {
            System.out.println("Tebakan tidak valid. Harap masukkan angka dari 1-6.");
        }

    }
    
}
