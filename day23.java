package isc;
public class day23 {
    public static void main(String[] args) {
        //hari ke duapuluh tiga dari 100 hari
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        // Melakukan transposisi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // matriks awal
        System.out.println("Matriks Awal:");
        printMatrix(matrix);

        // Menampilkan matriks transpose
        System.out.println("Matriks Transpose:");
        printMatrix(transpose);
    }

    // method untuk mencetak matriks hasil transpose
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
