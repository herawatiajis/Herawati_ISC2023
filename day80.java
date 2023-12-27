package isc;

import java.util.Vector;

public class day80 {
    public static void main(String[] args) {
        // Hari ke 80 dar 100 hari
        Vector<Integer> vektor = new Vector<>();

        vektor.add(50);
        vektor.add(20);
        vektor.add(3);
        vektor.add(12);
        
        System.out.println("isi vektor : " + vektor);
        
        int target = 3;
        if (vektor.contains(target)) {
            System.out.println(target + " ada dalam vektor.");
        } else {
            System.out.println(target + " tidak ada dalam vektor.");
        }

        vektor.sort(null);
        System.out.println("Isi vektor setelah diurutkan: " + vektor);
        
    }
    
}
