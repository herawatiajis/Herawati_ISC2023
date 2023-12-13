package isc;

import java.util.LinkedList;

public class day66 {
    public static void main(String[] args) {
        // Hari ke 66 dari 100 hari
        LinkedList<String> lklist = new LinkedList<>();

        lklist.add("Apel");
        lklist.add("Pisang");
        lklist.add("Jeruk");
        lklist.add("Mangga");
        lklist.add("Durian");
        lklist.add("Stroberi");

        System.out.println("Linked List: " + lklist);
        
        lklist.remove(2);
        System.out.println("setelah dihapus index ke - 2: " + lklist);

        lklist.removeFirst();
        System.out.println("setelah dihapus element pertama: " + lklist);

        lklist.removeLast();
        System.out.println("setelah dihapus element terakhir: " + lklist);
        
    }
    
}
