package isc;
import java.util.Scanner;
public class day90 {
    public static void main(String[] args) {
        // Hari ke 90 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Program Sederhana");
        System.out.println("1. Kalkulator Sederhana");
        System.out.println("2. Cek Bilangan Prima");
        System.out.println("3. Exit");

        System.out.print("Pilih menu (1-3): ");
        int pilihanMenu = scanner.nextInt();

        switch (pilihanMenu) {
            case 1:
                kalkulatorSederhana();
                break;
            case 2:
                cekBilanganPrima();
                break;
            case 3:
                System.out.println("Terima kasih. Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    static void kalkulatorSederhana() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }

    static void cekBilanganPrima() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        boolean prima = true;

        if (angka <= 1) {
            prima = false;
        } else {
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }
    }
    
}
