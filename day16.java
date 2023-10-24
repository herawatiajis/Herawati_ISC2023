package isc;
import java.util.Scanner;
public class day16 {
    public static void main(String[] args) {
        // Hari ke enambelas dari 100 hari
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan luas tanah :");
        int luasTanah =input.nextInt();
        
        int hargaPermeter = 300000;
        double totalHarga = luasTanah*hargaPermeter;
        System.out.println("Harga total tanah");
        double pajak,uangBersih;
        if (totalHarga > 50000000 && totalHarga < 100000000){
            pajak = 3/100;
            uangBersih = totalHarga-pajak;
            System.out.println("uang bersih yang didapatkan dari hasil penjualan tanah setelah potong pajak 3%");
            System.out.println("Uang bersih = " + uangBersih);
        }else if (totalHarga > 100000000){
            pajak = 5/100;
            uangBersih = totalHarga-pajak;
            System.out.println("uang bersih yang didapatkan dari hasil penjualan tanah setelah potong pajak 5%");
            System.out.println("Uang bersih = " + uangBersih);
        }else if (totalHarga < 50000000){
            pajak = 1/100;
            uangBersih = totalHarga-pajak;
            System.out.println("uang bersih yang didapatkan dari hasil penjualan tanah setelah potong pajak 1%");
            System.out.println("Uang bersih = " + uangBersih);
        }else{
            System.out.println("Terjadi kesalahan program");
        }
       
    }
    
}
