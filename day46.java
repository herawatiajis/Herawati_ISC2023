package isc;

import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        // Hari ke 46 dari 100 hari
        Scanner a = new Scanner(System.in);
        
        System.out.print("masukkan angka : ");
        int angka = a.nextInt();
        
        if (angka % 2 == 0){
            System.out.println(angka + " adalah angka genap");
        }else if(angka % 2 == 1){
            System.out.println(angka + " adalah angka ganjil");
        }else{
            System.out.println("tidak valid");
        }
        
    }
    
}
