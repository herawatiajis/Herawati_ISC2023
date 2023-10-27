package isc;
public class day19 {
    public static void main(String[] args) {
        // Hari ke sembilanbelas dari 100 hari
         // Array 2D dengan ukuran 3x3
        int[][] angkaBulat = new int[3][3];

        // Menginisialisasi array 2D
        angkaBulat[0][0] = 1;
        angkaBulat[0][1] = 2;
        angkaBulat[0][2] = 3;
        angkaBulat[1][0] = 4;
        angkaBulat[1][1] = 5;
        angkaBulat[1][2] = 6;
        angkaBulat[2][0] = 7;
        angkaBulat[2][1] = 8;
        angkaBulat[2][2] = 9;

        // Menampilkan isi array 2D
        for (int i = 0; i < angkaBulat.length; i++) {
            for (int j = 0; j < angkaBulat[i].length; j++) {
                System.out.print(angkaBulat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
