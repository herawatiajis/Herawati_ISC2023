package isc;

import java.util.Arrays;

public class day18 {
    public static void main(String[] args) {
        // Hari ke tujuhbelas dari 100 hari
        int [] angkaBulat = {1,2,4,3,5,67};
        
        System.out.println(Arrays.toString(angkaBulat));// menampilkan semua isi array
        System.out.println(angkaBulat[0]); // menampilkan item berdasarkan index
        
        System.out.println("update isi array :");
        angkaBulat[1] = 10;
        System.out.println(Arrays.toString(angkaBulat));
        
    }
    
}
