package isc;

import java.util.LinkedList;

public class day62 {
    public static void main(String[] args) {
        // Hari ke 62 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");
        lklist.add("Mangga");
        lklist.add("Durian");
        lklist.add("Stroberi");

        System.out.println("Linked List: " + lklist);
        
        System.out.println("Apakah linked list kosong ?? " + lklist.isEmpty());

        System.out.println("Ukuiran linkedlist: " + lklist.size());

        lklist.set(2, "Anggur");

        System.out.println("Linked list setelah ditambahkan (2,'Anggur') = " + lklist);
    }
    
}
