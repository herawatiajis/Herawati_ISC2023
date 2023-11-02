package isc;
public class day25 {
    public static void main(String[] args) {
        // Hari ke duapuluh lima dari 100 hari
        int[][][][] array4D = {
            {
                {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                },
                {
                    {10, 11, 12},
                    {13, 14, 15},
                    {16, 17, 18}
                }
            },
            {
                {
                    {19, 20, 21},
                    {22, 23, 24},
                    {25, 26, 27}
                },
                {
                    {28, 29, 30},
                    {31, 32, 33},
                    {34, 35, 36}
                }
            }
        };

        // Mencetak nilai dari array 4 dimensi
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.println("fourDArray[" + i + "][" + j + "][" + k + "][" + l + "] = " + array4D[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}
