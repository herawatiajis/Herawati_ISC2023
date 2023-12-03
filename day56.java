package isc;
public class day56 {
    public static void main(String[] args) {
        // Hari ke 56 dari 100 hari
        int[] inputArray = {12, 45, 23, 6, 87, 9, 56};

        System.out.println("Array sebelum diurutkan: ");
        printArray(inputArray);
        
        int n = inputArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (inputArray[j] < inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Array setelah diurutkan (descending): ");
        printArray(inputArray);
    }

    // Fungsi untuk mencetak array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
}
