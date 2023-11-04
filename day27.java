package isc;

import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        // Hari ke duapuluh enam tujuh dari 100 hari
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bula N :");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("negatif");  
        }
        else if (n >= 0) {
            System.out.println("positif");
        }
        else if (n == 0) {
            System.out.println("nol");
        }
    }
    
}
