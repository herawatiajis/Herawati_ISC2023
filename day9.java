package isc;
import java.util.Scanner;
public class day9 {

    public static void main(String[] args) {
        // Hari ke sembilan dari 100 hari
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        double nilai = input.nextDouble();

        char huruf;

        if (nilai >= 90) {
            huruf = 'A';
        } else if (nilai >= 80) {
            huruf = 'B';
        } else if (nilai >= 70) {
            huruf = 'C';
        } else if (nilai >= 60) {
            huruf = 'D';
        } else {
            huruf = 'E';
        }

        System.out.println("Nilai huruf Anda: " + huruf);

        if (huruf == 'A' || huruf == 'B') {
            System.out.println("Anda lulus dengan nilai yang baik!");
        } else if (huruf == 'C') {
            System.out.println("Anda lulus dengan nilai yang cukup.");
        } else if (huruf == 'D') {
            System.out.println("Anda perlu belajar lebih keras!!!.");
        } else {
            System.out.println("Anda tidak lulus.");
            System.out.println("Silahkan mengulang tahun depan");
        }
    }
    
    
}
