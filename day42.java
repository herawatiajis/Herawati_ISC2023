package isc;
public class day42 {
    public static void main(String[] args) {
        // hari ke empatpuluh dua dari 100 hari
        
        int [] arrSaya = {1,2,1,7,8,4,9};
        
        int jumlah = 0;
        for (int i = 0; i < arrSaya.length; i++) {
            System.out.print(arrSaya[i]);
            
            if (i < arrSaya.length - 1) {
                System.out.print("+"); 
            }
            
            jumlah += arrSaya[i] ;
            
        }
        System.out.println(" = " + jumlah);
    }
    
}
