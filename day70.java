package isc;

import java.util.LinkedList;
import java.util.Queue;

public class day70 {
    public static void main(String[] args) {
        // Hari ke 70 dari 100 hari
        
        Queue<String> queue = new LinkedList<>();

        queue.add("1");
        queue.add("2");
        queue.add("3");

        System.out.println("Queue setelah menggunakan add(): " + queue);
        
        String pik = queue.peek();
        System.out.println("Elemen pertama setelah menggunakan peek(): " + pik);

        // Mengambil dan menghapus elemen pertama
        String hapus = queue.poll();
        System.out.println("Elemen pertama setelah menggunakan poll(): " + hapus);
        System.out.println("Queue setelah menggunakan poll(): " + queue);

        // Menghapus elemen pertama
        queue.remove();
        System.out.println("Queue setelah menggunakan remove(): " + queue);

    }
    
}
