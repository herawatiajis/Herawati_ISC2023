package isc;
class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void Info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
public class day94 {
    public static void main(String[] args) {
        // Hari ke 94 dari 100 hari
        Mahasiswa mahasiswa1 = new Mahasiswa("Hera", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("Wajida", 22);

        mahasiswa1.setUmur(21);

        System.out.println("Nama Mahasiswa 1: " + mahasiswa1.getNama());
        System.out.println("Umur Mahasiswa 1: " + mahasiswa1.getUmur() + " tahun");

        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.Info();

        System.out.println("Informasi Mahasiswa 2:");
        mahasiswa2.Info();
        
    }
    
}
