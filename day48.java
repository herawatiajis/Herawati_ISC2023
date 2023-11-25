package isc;

import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        // Hari ke 48 dari 100 hari
        Scanner a = new Scanner(System.in);
        
        System.out.print("Masukkan batas atas : ");
        int batas = a.nextInt();
        
        int jumlah = 0;
        
        for (int i = 0; i <= batas; i++) {
            System.out.print(i);
            if (i < batas) {
                System.out.print("+");
            }
            jumlah += i; 
        }
        System.out.print(" = " + jumlah);
        
    }
    
}
