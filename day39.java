package isc;

import java.util.Scanner;

public class day39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();
        
        // Memanggil metode hitungLuas dengan memberikan nilai panjang dan lebar
        System.out.println("Luas persegi panjang adalah: " + hitungLuas(panjang, lebar));
    }

    static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
