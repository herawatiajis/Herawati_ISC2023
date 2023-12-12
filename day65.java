package isc;

import java.util.LinkedList;

public class day65 {
    public static void main(String[] args) {
        // Hari ke 65 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");
        lklist.add("Mangga");
        lklist.add("Durian");
        lklist.add("Stroberi");

        System.out.println("Linked List: " + lklist);
        
        String poll = lklist.poll();
        System.out.println("element yang di hapus : " + poll);
        System.out.println("Linked List setelah menggunakan poll(): " + lklist);

        // Menggunakan pollFirst()
        String pollfirst = lklist.pollFirst();
        System.out.println("element yang di hapus : " + pollfirst);
        System.out.println("Linked List setelah menggunakan pollFirst(): " + lklist);

        // Menggunakan pollLast()
        String polllast = lklist.pollLast();
        System.out.println("element yang di hapus : " + polllast);
        System.out.println("Linked List setelah menggunakan pollLast(): " + lklist);
        
    }
    
}
