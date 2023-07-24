package operatorjava;
public class operAritmatika {
    public static void main(String args[]){
        int a = 15, b = 6;
        
        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        float bagi = (float) a/b;
        int modulo = a % b;
        
        System.out.println("penjumlahan : " + a + " + " + b +" = " +jumlah);
        System.out.println("pengurangan : " + a + " - " + b +" = " +kurang);
        System.out.println("perkalian : " + a + " x " + b +" = " +kali);
        System.out.println("pembagian : " + a + " : " + b +" = " +bagi);
        System.out.println("sisa bagi : " + a + " % " + b +" = " +modulo);
    
    }
    
}
