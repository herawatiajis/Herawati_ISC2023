package isc;
public class day21 {
    public static void main(String[] args) {
        // Hari ke duapuluhsatu dari 100 hari
        int [][][] arr3D = {
            //Layer 1
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            //Layer2
            {
                {9,10,11},
                {12,13,4},
                {8,7,3}
            },
            //Layer3
            {
                {4,2,3},
                {7,9,5},
                {3,1,5}
            }
        };
        
        arr3D [1][0][1] = 30; // mengganti nilai layer 1, baris 0 dan kolom 1
        
        for (int layer = 0; layer < arr3D.length; layer++) {
            System.out.println("======================");
            System.out.println("Layer ke-" + layer);
            
            for (int baris = 0; baris < arr3D[layer].length; baris++) {
                for (int kolom = 0; kolom < arr3D[layer][baris].length; kolom++) {
                    System.out.print(arr3D[layer][baris][kolom] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------------");
        }
    }
    
}
