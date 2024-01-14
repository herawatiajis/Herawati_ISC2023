package isc;
import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}

class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan ke perpustakaan.");
    }

    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            System.out.println("===== Daftar Buku =====");
            for (Buku buku : daftarBuku) {
                System.out.println("Judul: " + buku.getJudul() + "\tPenulis: " + buku.getPenulis());
            }
        }
    }
}
public class day98 {
    public static void main(String[] args) {
        // Hari ke 98 dari 100 hari
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        int pilihan;

        do {
            System.out.println("===== Sistem Manajemen Perpustakaan =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-2): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = scanner.nextLine();
                    Buku bukuBaru = new Buku(judul, penulis);
                    perpustakaan.tambahBuku(bukuBaru);
                    break;
                case 2:
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Manajemen Perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }

        } while (pilihan != 0);

    }
    
}
