package isc;

import java.util.LinkedList;

public class day64 {
    public static void main(String[] args) {
        // Hari ke 64 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");
        lklist.add("Mangga");
        lklist.add("Durian");
        lklist.add("Stroberi");

        System.out.println("Linked List: " + lklist);
        
        lklist.push("Anggur");
        System.out.println("Linked List setelah push(): " + lklist);
        
        if (!lklist.isEmpty()) {
            lklist.removeFirst();
        }
        System.out.println("Linked List setelah pop(): " + lklist);

        if (!lklist.isEmpty()) {
            System.out.println("Elemen teratas (peek()): " + lklist.getFirst());
        } else {
            System.out.println("Linked List kosong");
        }

        if (!lklist.isEmpty()) {
            System.out.println("Elemen pertama (peekFirst()): " + lklist.getFirst());
        } else {
            System.out.println("Linked List kosong");
        }

        if (!lklist.isEmpty()) {
            System.out.println("Elemen terakhir (peekLast()): " + lklist.getLast());
        } else {
            System.out.println("Linked List kosong");
        }
        
    }
    
}
