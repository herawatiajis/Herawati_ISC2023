package isc;

import java.util.LinkedList;

public class day61 {
    public static void main(String[] args) {
        // Hari ke 61 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");
        lklist.add("Mangga");
        lklist.add("Durian");
        lklist.add("Stroberi");

        System.out.println("Linked List: " + lklist);
        
        lklist.remove("Pisang");
        System.out.println("Linked List setelah menghapus Pisang: " + lklist);

        lklist.remove(2);
        System.out.println("Linked List setelah menghapus elemen pada indeks 2: " + lklist);

        lklist.removeFirst();
        System.out.println("Linked List setelah menghapus elemen pertama: " + lklist);

        lklist.removeLast();
        System.out.println("Linked List setelah menghapus elemen terakhir: " + lklist);
    }
    
}
