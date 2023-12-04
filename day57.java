package isc;

import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        // Hari ke 57 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        if (bilangan1 > bilangan2) {
            System.out.println(bilangan1 + " lebih besar dari " + bilangan2);
        } else if (bilangan1 < bilangan2) {
            System.out.println(bilangan1 + " lebih kecil dari " + bilangan2);
        } else {
            System.out.println(bilangan1 + " sama dengan " + bilangan2);
        }


        if (bilangan1 > 0) {
            System.out.println(bilangan1 + " adalah bilangan positif");
        } else if (bilangan1 < 0) {
            System.out.println(bilangan1 + " adalah bilangan negatif");
        } else {
            System.out.println(bilangan1 + " adalah bilangan nol");
        }

        if (bilangan2 % 2 == 0) {
            System.out.println(bilangan2 + " adalah bilangan genap");
        } else {
            System.out.println(bilangan2 + " adalah bilangan ganjil");
        }
    }
    
}
