package isc;

import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        // Hari ke 49 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Master Class");
        } else if (angka % 3 == 0) {
            System.out.println("Pride of 3");
        } else if (angka % 5 == 0) {
            System.out.println("Pride of 5");
        } else {
            System.out.println("Angka tidak memenuhi ketentuan.");
        }

    }
    
}
