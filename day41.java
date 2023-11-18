package isc;

import java.util.Scanner;

public class day41 {
    
    static int faktori(int n){
        if(n == 1 || n == 0){
          return 1;  
        }else{
            return n * faktori(n-1);   
        }
           
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int bil = scanner.nextInt();
        int hasil = faktori(bil);

        System.out.println("Faktorial dari " + bil + " adalah: " + hasil);
    }
    
}
