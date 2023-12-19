package isc;

import java.util.HashSet;

public class day72 {
    public static void main(String[] args) {
        // Hari ke 72 dari 100 hari
        HashSet<String> hashSet = new HashSet<>();
        
        hashSet.add("apel");
        hashSet.add("pisang");
        hashSet.add("jeruk");
        hashSet.add("anggur");

        System.out.println("HashSet: " + hashSet);

        System.out.println("Elemen-elemen HashSet:");
        for (String elemen : hashSet) {
            System.out.println(elemen);
        }

        hashSet.remove("pisang");

        System.out.println("Ukuran HashSet setelah menghapus: " + hashSet.size());

   
    }
    
}
