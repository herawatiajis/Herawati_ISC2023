package isc;
import java.util.Scanner;
class Mahasiswa {
    
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class day91 {
    public static void main(String[] args) {
        // THari ke 91 dari 100 hari
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa.tampilkanInfo();

        scanner.close();
    }
        
}
    

