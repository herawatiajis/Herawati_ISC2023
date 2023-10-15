package isc;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        // Hari ke tujuh dari 100 hari
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan a :");
        a = input.nextInt();
        System.out.print("Masukkan bilangan b :");
        b = input.nextInt();
        
        System.out.println("====== Hasil perbandingan ======");
        System.out.println("bilangan a == b :" + (a == b));
        System.out.println("bilangan a != b :" + (a != b));
        System.out.println("bilangan a <= b :" + (a <= b));
        System.out.println("bilangan a >= b :" + (a >= b));
        System.out.println("bilangan a < b :" + (a < b));
        System.out.println("bilangan a > b :" + (a > b));
    }
    
}
