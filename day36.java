package isc;
import java.util.ArrayList;
import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        // Hari ke tigapuluh enam dari 100 hari

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        System.out.print("Masukkan panjang array: ");
        int ukuran = sc.nextInt();
        for (int i = 0; i <= ukuran; i++) {
            System.out.print("Masukkan data : ");
            int isi = sc.nextInt();
            data.add(isi);
        }
        System.out.println("Isi array: " + data);

    }
    
}
