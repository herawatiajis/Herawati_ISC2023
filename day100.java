package isc;
import java.util.HashSet;
import java.util.Iterator;
public class day100 {
    public static void main(String[] args) {
        // Hari ke 100 dari 100 hari
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apel");
        hashSet.add("Pisang");
        hashSet.add("Jeruk");
        hashSet.add("Anggur");

        System.out.println("Elemen-elemen HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hashSet.remove("Pisang");

        System.out.println("\nElemen-elemen HashSet setelah dihapus:");
        for (String buah : hashSet) {
            System.out.println(buah);
        }

        System.out.println("\nJumlah elemen dalam HashSet: " + hashSet.size());

        System.out.println("Apakah HashSet kosong? " + hashSet.isEmpty());

        hashSet.clear();

        System.out.println("\nElemen-elemen HashSet setelah dibersihkan:");
        for (String buah : hashSet) {
            System.out.println(buah);
        }
    }
    
}
