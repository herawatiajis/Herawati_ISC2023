package isc;

import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        // Hari ke 81 dari 100 hari
         Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nomor bulan
        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        String namaBulan;
        switch (nomorBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Nomor bulan tidak valid";
        }

        // Menampilkan nama bulan
        System.out.println("Nama bulan: " + namaBulan);
    }
    
}
