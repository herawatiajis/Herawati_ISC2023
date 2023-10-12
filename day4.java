package isc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class day4 {

    public static void main(String[] args) {
        //Hari keempat dari 100 hari
        //output ke file
        System.out.println("====== Output Ke File ======");
        String file = "D:/input.txt";
        String isi = "tetap semangat belajar java!!";//konten untuk mengisi file
        try {
            FileWriter filetulis = new FileWriter(file);// menginstan objek
            filetulis.write(isi);
            filetulis.close();
            
            System.out.println("file sudah ditulis ulang");
        } catch (IOException e) {
            System.out.println("terjadi kesalahan");//untuk mengecek apakah terjadi kesalahan 
        }
        System.out.println("====== Input Dari File ======");
        // input dari file
        String fileIn = "D:/Ayo.txt";
        
        try {
            File filenya = new File(fileIn);
            Scanner baca = new Scanner(filenya);
            
            while(baca.hasNextLine()){
                String data = baca.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("terjadi kesalahan");
        }
    }
    
}
