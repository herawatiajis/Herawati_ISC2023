package isc;

import java.util.Vector;

public class day79 {
    public static void main(String[] args) {
        // Hari ke 79 dari 100 hari
        Vector<String> vektor = new Vector<>();

        vektor.add("Apel");
        vektor.add("Pisang");
        vektor.add("Jeruk");
        
        System.out.println("isi vektor : " + vektor);

        vektor.remove("Pisang");
        System.out.println("Vektor setelah menghapus 'Pisang': " + vektor);

        // konversi vektor ke array
        String[] array = vektor.toArray(new String[0]);

        System.out.print("isi array : ");
        for (String buah : array) {
            System.out.print(buah + " ");
        }
        System.out.println();
        
        
    }
    
}
