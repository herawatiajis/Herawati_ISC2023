package isc;

import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        // Hari ke 71 dari 100
        
        int nilai1, nilai2;
        double hasil;
        Scanner masukkan = new Scanner(System.in);
        
        System.out.print("Masukkan nilai pertama: ");
        nilai1 = masukkan.nextInt();
        
        System.out.print("Masukkan nilai kedua: ");
        nilai2 = masukkan.nextInt();
        
        masukkan.nextLine(); // Membersihkan newline dari buffer
        
        System.out.println("Pilih operasi :");
        System.out.println("a. pengurangan [-]");
        System.out.println("b. penjumlahan [+]");
        System.out.println("c. pembagian [/]");
        System.out.println("d. perkalian [*]");
        
        System.out.print("Masukkan nomor operator pilihan anda: ");
        String pilihan = masukkan.nextLine().trim().toLowerCase();
        
        if (pilihan.equals("a")) {
            hasil = nilai1 - nilai2;
            System.out.println("Hasil operasi "  + nilai1 + " - " + nilai2 + " = " + hasil);
        } else if (pilihan.equals("b")) {
            hasil = nilai1 + nilai2;
            System.out.println("Hasil operasi "  + nilai1 + " + " + nilai2 + " = " + hasil);
        } else if (pilihan.equals("c")) {
            hasil = (double) nilai1 / nilai2; // Membuat hasil menjadi double
            System.out.println("Hasil operasi "  + nilai1 + " / " + nilai2 + " = " + hasil);
        } else if (pilihan.equals("d")) {
            hasil = nilai1 * nilai2;
            System.out.println("Hasil operasi "  + nilai1 + " * " + nilai2 + " = " + hasil);
        } else {
            System.out.println("Pilihan operasi tidak tersedia");
        }
    }
    
}
