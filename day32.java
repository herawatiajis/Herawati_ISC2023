package isc;

import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        // Hari ke tigapuluh dua dari 100 hari
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan nilai x :");
        int x =a.nextInt();
        System.out.print("Masukkan nilai y :");
        int y =a.nextInt();
        
        int p = x+y;
        System.out.println("nilai p :" + p);
        if (p >=4) {
            int q = x*y;
            System.out.println("nilai q :" + q); 
        }else{
           int q = x/y;
            System.out.println("nilai q :" + q);
        }
    }
    
}
