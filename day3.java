package isc;
import java.util.Scanner;
public class day3 {
    
    public static void main(String[] args) {
        // Hari ketiga dari 100 hari
        String nama; //deklarasi variabel
        byte umur;
        char kelas;
        final short angkatan; //variabel constant
        
        nama = "herawati"; //inisialisasi variabel
        umur = 20;
        umur ++; // mengupdate nilai variabel
        kelas = 'E';
        angkatan = 2021;
        
        //menampilkan nilai variabel yang telah diinisialisasi
        System.out.println("nama :" + nama);
        System.out.println("umur :" + umur);
        System.out.println("kelas :" + kelas);
        System.out.println("angkatan :" + angkatan);
        
        //input dan output console
        Scanner input = new Scanner(System.in);
        System.out.print("Bagaimana perasaan anda hari ini :");
        String mood = input.nextLine();


    }
    
}
