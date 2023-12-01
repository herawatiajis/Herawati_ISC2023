package isc;

import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        // Hari ke 54 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan umur
        System.out.print("Masukkan umur Anda: ");
        
        // Membaca input umur dari pengguna
        int umur = scanner.nextInt();

        // Menentukan kategori umur berdasarkan kondisi
        if (umur < 0) {
            System.out.println("Umur tidak valid.");
        } else if (umur < 6) {
            System.out.println("Anda termasuk dalam kategori anak-anak.");
        } else if (umur < 18) {
            System.out.println("Anda termasuk dalam kategori remaja.");
        } else if (umur < 60) {
            System.out.println("Anda termasuk dalam kategori dewasa.");
        } else {
            System.out.println("Anda termasuk dalam kategori manula.");
        }
    }
    
}
