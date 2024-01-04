package isc;

import java.util.Scanner;

public class day88 {
    public static void main(String[] args) {
        // Hari ke 88 dari 100
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        int penjumlahan = bilangan1 + bilangan2;
        int pengurangan = bilangan1 - bilangan2;
        int perkalian = bilangan1 * bilangan2;

        double pembagian = (bilangan2 != 0) ? (double) bilangan1 / bilangan2 : Double.NaN;

        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);
        System.out.println("Hasil Perkalian: " + perkalian);
        
        if (!Double.isNaN(pembagian)) {
            System.out.println("Hasil Pembagian: " + pembagian);
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
        }
    }
    
}
