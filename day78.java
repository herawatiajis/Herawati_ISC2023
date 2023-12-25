package isc;

import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        // Hari ke 78 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        if (angka1 > angka2) {
            System.out.println("Angka terbesar adalah: " + angka1);
        } else if (angka2 > angka1) {
            System.out.println("Angka terbesar adalah: " + angka2);
        } else {
            System.out.println("Angka-angka tersebut sama besar.");
        }

    }
    
}
