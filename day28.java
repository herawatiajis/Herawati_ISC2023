package isc;

import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int kolom = a.nextInt();
        int baris = a.nextInt();
        
        
        for (int i = 1; i <= kolom; i++) {
            for (int j = 1; j <= baris; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    
}
