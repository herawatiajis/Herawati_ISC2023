package isc;

import java.util.LinkedList;

public class day63 {
    public static void main(String[] args) {
        // Hari ke 63 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");
        lklist.add("Mangga");
        lklist.add("Durian");
        lklist.add("Stroberi");

        System.out.println("Linked List: " + lklist);
        
        System.out.println("Apakah \"Mangga\" ada dalam linked list? " + lklist.contains("Mangga"));

        lklist.offer("Anggur");
        System.out.println("Linked List setelah menambahkan \"Anggur\": " + lklist);

        lklist.offerFirst("Semangka");
        System.out.println("Linked List setelah menambahkan \"Semangka\" di awal: " + lklist);

        lklist.offerLast("Melon");
        System.out.println("Linked List setelah menambahkan \"Melon\" di akhir: " + lklist);
        
    }
    
}
