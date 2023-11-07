
class HelloWorld {
    public static void main(String[] args) {
   
        int tinggiSegitiga = 5;

        for (int i = 1; i <= tinggiSegitiga; i++) {
            
            for (int j = tinggiSegitiga - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    


        
    }
}
