package isc;
import java.util.Scanner;
public class day13 {
    public static void main(String[] args) {
        // Hari ke tigabelas dari 100 hari
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka (1-5): ");
        int angka = input.nextInt();
        String hari = "";
        
        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak valid.");
                System.exit(0);
        }
        
        System.out.println("Hari ke-" + angka + " adalah " + hari);
    }
    
}
