package isc;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        // Hari ke 83 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();
        
        String kataTerbalik = balikKata(kata);
        System.out.println("Kata terbalik: " + kataTerbalik);

    }

    private static String balikKata(String kata) {
        char[] karakter = kata.toCharArray();
        int panjang = karakter.length;

        
        for (int i = 0; i < panjang / 2; i++) {
            char temp = karakter[i];
            karakter[i] = karakter[panjang - i - 1];
            karakter[panjang - i - 1] = temp;
        }

        return new String(karakter);
    }
    
}
