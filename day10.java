package isc;
import java.util.Scanner;
public class day10 {

    public static void main(String[] args) {
        // Hari ke 10 dari 100 hari
        /*
        menentukan apakah nilai ulangan tengah semester seorang siswa 
        tuntas atau tidak tuntas dengan menggunakan operator ternary
        */
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Masukkan nama :");
        String nama = input.next();
        
        System.out.print("Masukkan Nilai :");
        int nilai = input.nextInt();
        
        int kkm = 75;
        
        String hasil = nilai >= kkm ? "Tuntas" : "Tidak Tuntas";
        System.out.println("Anda dinyatakan " + hasil);
        
        
        
        
        
    }
    
}
