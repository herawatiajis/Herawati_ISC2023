package isc;
public class day22 {
    public static void main(String[] args) {
        // Hari ke duapuluh dua dari 100 hari
        
        // Matriks A
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Matriks B
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Menghitung jumlah baris dan kolom untuk matriks hasil
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;
        int kolom2 = matrix2[0].length;

        // Matriks hasil
        int[][] hasil = new int[baris1][kolom2];

        // Perkalian matriks
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Menampilkan hasil perkalian matriks
        System.out.println("Hasil Perkalian Matriks:");
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
           
    }
    
}
