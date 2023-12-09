package isc;

import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        // Hari ke 50 dari 100 hari
        
        Scanner a = new Scanner(System.in);
        
        while(true){
            System.out.print("Masukkan bilangan : ");
            int bil = a.nextInt();
            if (bil % 2 == 0){
                System.out.println("bilangan genap");
            }else if (bil % 2 == 1){
                System.out.println("You and I, end");
                break;
            }
        }
        
    }
    
}
