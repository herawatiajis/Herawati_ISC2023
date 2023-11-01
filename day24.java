package isc;
import java.util.Scanner;
public class day24 {
    public static void main(String[] args) {
        // hari ke duapuluh empat dari 100 hari
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas akhir angka :");
        int batasAngka = input.nextInt();
        
        for (int i = 0; i < batasAngka; i++) {
            if (i % 3 == 0 && i != 0){
                System.out.println(i);
            }
            
        }
    }
    
}
