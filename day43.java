package isc;

import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        // hari ke 43 dari 100 hari
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan modal awal: ");
        double modalAwal = scanner.nextDouble();

        System.out.print("Masukkan lama investasi (dalam tahun): ");
        int lamaInvestasi = scanner.nextInt();

        System.out.print("Masukkan tingkat keuntungan per tahun (dalam persen): ");
        double tingkatKeuntunganPerTahun = scanner.nextDouble();

        tingkatKeuntunganPerTahun /= 100.0;

        for (int tahun = 1; tahun <= lamaInvestasi; tahun++) {
            double keuntunganTahunIni = modalAwal * tingkatKeuntunganPerTahun;
            modalAwal += keuntunganTahunIni;

            System.out.println("Tahun " + tahun + ", Modal = " + modalAwal + ", Keuntungan = " + keuntunganTahunIni);
        }

    }
    
}
