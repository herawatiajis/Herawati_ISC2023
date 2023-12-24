package isc;

import java.util.Vector;

public class day77 {
    public static void main(String[] args) {
        // Hari ke 77 dari 100 hari
        Vector<String> vektor = new Vector<>();

        vektor.add("Apel");
        vektor.add("Pisang");
        vektor.add("Jeruk");


        System.out.println("Ukuran : " + vektor.size());

        System.out.println("Index dari pisang : " + vektor.indexOf("Pisang"));

        System.out.println("Apakah vektor kosong? " + vektor.isEmpty());
        
    }
    
}
