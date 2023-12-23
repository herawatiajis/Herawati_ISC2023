package isc;

import java.util.Vector;

public class day76 {
    public static void main(String[] args) {
        // Hari ke 76 dari 100 hari
        Vector<Object> vector = new Vector<>();

        vector.add("Haii");
        vector.add(123);
        vector.add(3.14);
        vector.add(true);

        System.out.println("Isi Vector: " + vector);

        Object nilai1 = vector.get(0);
        Object nilai2 = vector.get(1);

        System.out.println("Elemen 1: " + nilai1);
        System.out.println("Elemen 2: " + nilai2);
    }
    
}
