package isc;

import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        // Hari ke tigapuluh lima dari 100 hari 
        Scanner input = new Scanner(System.in);
        System.out.print("Masuukan gaji :");
        int gaji = input.nextInt();
        
        int zakat =  5240000;
        
        
        if (gaji >= zakat){
            double pajak = 2.5/100;
            double gajiBersih = gaji*pajak;
            System.out.println("gaji bersih setelah mendapatkan pajak" + gajiBersih);
        }else{
            System.out.println("gaji tidak memenuhi dan tidak mendapatkan potongan");
        }

    }
    
}
