package isc;
public class day58 {
    public static void main(String[] args) {
        // Hari ke 58 dari 100 hari
        int[] numbers = {5, 10, 15, 20, 25};
        
        double average = hitungRataRata(numbers);
        System.out.println("Rata-rata: " + average);
    }

    public static double hitungRataRata(int[] array) {
        if (array.length == 0) {
            System.out.println("Array kosong, tidak dapat menghitung rata-rata.");
            return 0.0;
        }
        int total = 0;
        for (int num : array) {
            total += num;
        }
        double average = (double) total / array.length;

        return average;
    
    }
    
}
