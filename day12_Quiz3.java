package isc;

import java.util.Scanner;

public class day12_Quiz3 {
    public static void main(String[] args) {
        // Hari ke duabelas dari 100 hari
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan m: ");
        int m = input.nextInt();
        System.out.print("Masukkan bilangan n: ");
        int n = input.nextInt();
        
        if (n < m){
            int sum = 0;
            for (int i = n +1; i < m; i++) {
                sum += i; 
            }
            System.out.print(n + " + ");
            for (int i = n + 1; i < m - 1; i++) {
                System.out.print(i + " + ");
            }
            System.out.println(" = " + sum);
        } else {
            System.out.println("Bilangan n harus lebih kecil dari m.");
        }
    }
    
}
