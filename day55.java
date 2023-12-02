package isc;

import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        // Heri ke 55 dari 100 hari
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();

        int[] arr = new int[panjangArray];

        // Memasukkan elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int nilaiMaksimum = arr[0];
        int nilaiMinimum = arr[0];

        for (int i = 1; i < panjangArray; i++) {
            if (arr[i] > nilaiMaksimum) {
                nilaiMaksimum = arr[i];
            }
            if (arr[i] < nilaiMinimum) {
                nilaiMinimum = arr[i];
            }

        System.out.println("Nilai Maksimum: " + nilaiMaksimum);
        System.out.println("Nilai Minimum: " + nilaiMinimum);

    }
    
}
