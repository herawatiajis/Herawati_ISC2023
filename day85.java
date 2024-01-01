package isc;

import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        // Hari ke 85 dari 100 hari
        Scanner scanner = new Scanner(System.in);
        int angkaRandom = (int) (Math.random() * 100) + 1;
        boolean tebakanBenar = false;
        int tebakan;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 dan 100. Coba tebak!");

        while (!tebakanBenar) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();

            if (tebakan == angkaRandom) {
                System.out.println("Selamat! Anda berhasil menebak angka " + angkaRandom + "!");
                tebakanBenar = true;
            } else if (tebakan < angkaRandom) {
                System.out.println("Tebakan terlalu kecil. Coba lagi.");
            } else {
                System.out.println("Tebakan terlalu besar. Coba lagi.");
            }
        }

    }
    
}
