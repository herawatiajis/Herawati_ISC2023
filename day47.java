package isc;
public class day47 {
    public static void main(String[] args) {
        // hari ke 47 dari 100 hari
        

        int n = 8;
        int a = 0, b = 1;

        System.out.println("Deret Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
