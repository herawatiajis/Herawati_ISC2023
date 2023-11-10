package isc;

import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        //Hari ke tigapuluh empat dari 100 hari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas atas untuk menampilkan bilangan prima: ");
        int batasAtas = scanner.nextInt();

        System.out.println("Bilangan prima hingga " + batasAtas + " adalah:");
        for (int i = 2; i <= batasAtas; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima
    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
