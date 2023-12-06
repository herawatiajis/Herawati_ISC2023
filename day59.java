package isc;

import java.util.LinkedList;

public class day59 {
    public static void main(String[] args) {
        // Hari ke 59 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");

        System.out.println("Linked List: " + lklist);

        lklist.add(1, "anggur");
        System.out.println("Linked List setelah menambahkan Anggur pada indeks 1: " + lklist);

        lklist.addFirst("Mangga");
        System.out.println("Linked List setelah menambahkan Mangga di awal: " + lklist);

        lklist.addLast("Strawberi");
        System.out.println("Linked List setelah menambahkan Strawberi di akhir: " + lklist);
    }
    
    
}
