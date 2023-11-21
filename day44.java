package isc;

import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        // Hari ke 44 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        double[] nilaiUjian = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai ujian mahasiswa ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextDouble();
        }

        double totalNilai = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalNilai += nilaiUjian[i];
        }

        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai ujian mahasiswa: " + rataRata);
    }
    
}
