package isc;

import java.util.HashMap;
import java.util.Map;

public class day74 {
    public static void main(String[] args) {
        // Hari ke 74 dari 100 hari
        Map<String, Integer> hashMap = new HashMap<>();

        // Menambahkan elemen ke dalam HashMap
        hashMap.put("Kunci1", 10);
        hashMap.put("Kunci2", 20);
        hashMap.put("Kunci3", 30);

        System.out.println("Nilai untuk Kunci2: " + hashMap.get("Kunci2"));
        
        System.out.println("Menampilkan Semua Isi HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Kunci: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
        
    }
    
}
