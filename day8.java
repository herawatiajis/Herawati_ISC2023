package isc;

import java.util.Scanner;

public class day8 {

    public static void main(String[] args) {
        // Hari ke delapaan dari 100 hari
        //kalkulator sederhana mengoperasikan 2 bilangan
        
        int nilai1,nilai2,pilihan;
        double hasil;
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = masukkan.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = masukkan.nextInt();
        
        System.out.println("Pilih operasi :");
        System.out.println("1. pengurangan [-]");
        System.out.println("2. penjumlahan [+]");
        System.out.println("3. pembagian [/]");
        System.out.println("4. perkalian [*]");
        
        System.out.print("Masukkan nomor operator pilihan anda : ");
        pilihan = masukkan.nextInt();
        if (pilihan == 1){
            hasil = nilai1 - nilai2;
                System.out.println("Hasil operasi "  + nilai1 + " - " + nilai2 + " = "+ hasil);
        }else if (pilihan == 2){
            hasil = nilai1 + nilai2;
                System.out.println("Hasil operasi "  + nilai1 + " + " + nilai2 + " = "+ hasil);
        }else if (pilihan == 3){
            hasil = nilai1 / nilai2;
                System.out.println("Hasil operasi "  + nilai1 + " / " + nilai2 + " = "+ hasil);
        }else if (pilihan == 4){
            hasil = nilai1 * nilai2;
                System.out.println("Hasil operasi "  + nilai1 + " * " + nilai2 + " = "+ hasil);
        }else{
            System.out.println("Pilihan operasi tidak tersedia");
        }
    }
    
    
}
