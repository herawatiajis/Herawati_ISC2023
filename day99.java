package isc;
import java.util.Scanner;
public class day99 {
    public static void main(String[] args) {
        // Hari ke 99 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan untuk dihitung faktorialnya: ");
        int bilangan = scanner.nextInt();

        if (bilangan < 0) {
            System.out.println("Maaf, faktorial tidak dapat dihitung untuk bilangan negatif.");
            System.exit(0);
        }

        long faktorial = hitungFaktorial(bilangan);

        System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);

    }

    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
    
}
