package isc;

import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        // Hari ke 82 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi A: ");
        double sisiA = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi B: ");
        double sisiB = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi C: ");
        double sisiC = scanner.nextDouble();

        if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("Segitiga sama sisi");
        } else if (sisiA == sisiB || sisiB == sisiC || sisiA == sisiC) {
            System.out.println("Segitiga sama kaki");
        } else {
            System.out.println("Segitiga sembarang");
        }

    }
    
}
