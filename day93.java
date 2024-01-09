package isc;
class Dosen {
    String nama;
    int pengalaman;

    public Dosen(String nama, int pengalaman) {
        this.nama = nama;
        this.pengalaman = pengalaman;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Pengalaman: " + pengalaman + " tahun");
    }
}
public class day93 {
    public static void main(String[] args) {
        // Hari ke 93 dari 100 hari
        Dosen dosen = new Dosen("Herawati", 10);
        
        if (dosen instanceof Dosen) {
            System.out.println("\nObjek adalah instansiasi dari kelas Dosen");
            dosen.tampilkanInfo();
        }else{
            System.out.println("objek bukan instansi dari kelas Dosen");
        }
    }
    
}
