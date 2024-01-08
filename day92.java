package isc;
// Hari ke 92 dari 100 hari
class Buku {
    private String judul;
    private String penulis;

    class DetailBuku {
        private int halaman;
        private int tahunTerbit;

        public DetailBuku(int halaman, int tahunTerbit) {
            this.halaman = halaman;
            this.tahunTerbit = tahunTerbit;
        }

        public void tampilkanDetail() {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Halaman: " + halaman);
            System.out.println("Tahun Terbit: " + tahunTerbit);
        }
    }

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public DetailBuku getDetailBuku(int halaman, int tahunTerbit) {
        return new DetailBuku(halaman, tahunTerbit);
    }
}

public class day92 {
    public static void main(String[] args) {
        Buku buku = new Buku("Dasar-Dasar Pemrograman", "Herawati");

        Buku.DetailBuku detailBuku = buku.getDetailBuku(300, 2022);

        System.out.println("Informasi Buku:");
        detailBuku.tampilkanDetail();
    }
    
}
