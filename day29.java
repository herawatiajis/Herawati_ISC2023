package isc;

import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        // Hari ke duapuluh sembilan dari 100 hari
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka n :");
        int n = input.nextInt();
        System.out.print("masukkan angka m :");
        int m = input.nextInt();
        
        System.out.println("Masing Masing A :" + (n/m));
        System.out.println("Bersisa :" + (n%m));
    }
    
}
