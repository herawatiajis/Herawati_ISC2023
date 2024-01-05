package isc;

import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        // Hari ke 89 dari 100 hari
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = scanner.nextInt();

        double[] nilai = new double[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
        }

        double totalNilai = 0;
        for (double nilaiTunggal : nilai) {
            totalNilai += nilaiTunggal;
        }

        double rataRata = totalNilai / jumlahNilai;
        
        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Rata-rata nilai: " + rataRata);

        System.out.println("Nilai di atas rata-rata:");
        for (double nilaiTunggal : nilai) {
            if (nilaiTunggal > rataRata) {
                System.out.println(nilaiTunggal);
            }
        }
    }
    
}
