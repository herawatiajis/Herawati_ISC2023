package isc;

import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        // Hari ke 87 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Anda admin? (ya/tidak): ");
        String statusAdmin = scanner.nextLine();

        if ("ya".equalsIgnoreCase(statusAdmin)) {
            System.out.println("Selamat datang, Admin!");
        } else {
            System.out.println("Silakan login sebagai admin untuk mengakses fitur ini.");
            System.exit(0);
        }

        int kapasitasProduk = 5;
        String[] daftarProduk = new String[kapasitasProduk];
        int jumlahProduk = 0;

       
        while (true) {
            System.out.print("=========================================");
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    if (jumlahProduk < kapasitasProduk) {
                        System.out.print("Masukkan nama produk: ");
                        String namaProduk = scanner.nextLine();
                        daftarProduk[jumlahProduk] = namaProduk;
                        jumlahProduk++;
                        System.out.println("Produk berhasil ditambahkan!");
                    } else {
                        System.out.println("Kapasitas produk penuh. Tidak dapat menambahkan produk baru.");
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Produk:");
                    for (int i = 0; i < jumlahProduk; i++) {
                        System.out.println((i + 1) + ". " + daftarProduk[i]);
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Program keluar.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
    
}
