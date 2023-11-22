package javaapplication8;
public class day45 {

    public static void main(String[] args) {
        // hari ke 45 dari 100 hari
        int [] arr = {1,6,5,9};
        
        int hasil = 1;
        
        for (int i = 0; i < arr.length; i++) {
            hasil *= arr[i];
        }
        System.out.println("hasil perkalian : " + hasil);
    }
    
}
