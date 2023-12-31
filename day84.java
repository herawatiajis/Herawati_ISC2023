package isc;

import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        // Hari ke 84 dari 100 hari
        
        Scanner scanner = new Scanner(System.in);
        
        int bilangan;

        do {
            System.out.print("Masukkan sebuah bilangan (0 untuk keluar): ");
            bilangan = scanner.nextInt();

            if (bilangan != 0) {
                if (bilangan % 2 == 0) {
                    System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
                } else {
                    System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
                }
            }

        } while (bilangan != 0);

        System.out.println("Program selesai.");
    }
    
}
