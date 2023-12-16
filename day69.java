package isc;

import java.util.LinkedList;
import java.util.Queue;

public class day69 {
    public static void main(String[] args) {
        // Hari ke 69 dari 100 hari
         Queue<String> queue = new LinkedList<>();

        queue.add("1");
        queue.add("2");
        queue.add("3");

        System.out.println("Queue setelah menggunakan add(): " + queue);

        queue.offer("4");
        queue.offer("5");
        
        System.out.println("Queue setelah menggunakan offer(): " + queue);
    }
    
}
