package isc;
import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        //Hari kelima dari 100 hari
        //operator aritmatika
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama :");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua :");
        int angka2 = input.nextInt();
        
        // mengoperasikan 2 bilangan bulat menggunakan operator aritmatika
        
        int penjumlahan = angka1+angka2;
        int perkalian = angka1*angka2; 
        int pengurangan = angka1-angka2;
        double pembagian = angka1/angka2;
        int sisaBagi = angka1%angka2;
        
        System.out.println("======== Hasil Operasi ========");
        System.out.println("hasil penjumlahan dari angka pertama dan kedua : " + penjumlahan);
        System.out.println("hasil kali dari angka pertama dan kedua : " + perkalian);
        System.out.println("hasil pengurangan dari angka pertama dan kedua : " + pengurangan);
        System.out.println("hasil bagi dari angka pertama dan kedua : " + pembagian);
        System.out.println("hasil modulus dari angka pertama dan kedua :" + sisaBagi);
        
    }
    
}
