package isc;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        // Hari ke 51 dari 100 hari 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka batas atas: ");
        int batasAtas = scanner.nextInt();

        int jumlahAngka = 0;

        for (int i = 1; i <= batasAtas; i++) {
            if (i % 3 == 0) {
                jumlahAngka++;
            }
        }

        System.out.println("Jumlah angka yang habis dibagi 3 antara 1 dan " + batasAtas + " adalah: " + jumlahAngka);
    }
    
}
