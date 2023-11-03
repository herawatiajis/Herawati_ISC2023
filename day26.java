package isc;
public class day26 {
    public static void main(String[] args) {
        // hari ke duapuluh enam dari 100 hari
        int baris = 2;
        int kolom = 2;

        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{5, 6}, {7, 8}};
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Hasil penjumlahan array:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
