package isc;
import java.util.Scanner;
public class day11_Quiz2 {

    public static void main(String[] args) {
        // Hari ke 10 dari 100 hari
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai m :");
        int m = input.nextInt();
        
        System.out.print("Masukkan nilai n :");
        int n = input.nextInt();
        
        System.out.println("nilai m :" + m);
        System.out.println("nilai n :" + n);
        
        for (int i = Math.min(m, n) + 1; i < Math.max(m, n); i++) {
            System.out.print(i);
            if (i < Math.max(m, n) - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        

        
    }
    
}
