package isc;
class Kendaraan {
    private String merek;
    private String model;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
    }
}

class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, String model, int jumlahPintu) {
        super(merek, model);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
public class day95 {
    public static void main(String[] args) {
        // Hari ke 95 dari 100 hari
        Mobil mobilSaya = new Mobil("Toyota", "Camry", 4);

        mobilSaya.tampilkanInfo();
        
    }
    
}
