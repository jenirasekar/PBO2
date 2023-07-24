
package latihantipedata;

public class LatihanTipedata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama="Jenira Sekar Az-zahra";
        String diket="alas = 9 cm, tinggi = 6 cm";
        String ditanya="berapa luas segitiga?";
        String jawab0="luas segitiga = alas . tinggi / 2";
        String jawab="luas segitiga = 9 cm . 6 cm / 2";
        int alas=9;
        int tinggi=6;
        int luas=alas*tinggi/2;
        
        System.out.println("Nama:   "+nama);
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Diketahui:  "+diket);
        System.out.println("Ditanya:    "+ditanya);
        System.out.println("Jawab:  "+jawab0);
        System.out.println("Jawab:  "+jawab);
        System.out.println("                     ="  +luas);
        
     
        String diket2="panjang = 8 cm, lebar = 4 cm, tinggi = 6 cm";
        String ditanya2="berapa volume balok?";
        String jawab1="volume = panjang . lebar . tinggi";
        String jawab2="volume = 8 cm . 4 cm . 6 cm";
        int panjang2=8;
        int lebar2=4;
        int tinggi2=6;
        int volume=panjang2*lebar2*tinggi2;
        
        System.out.println("Menghitung Volume Balok");
        System.out.println("Diketahui:  "+diket2);
        System.out.println("Ditanya:    "+ditanya2);
        System.out.println("Jawab:  "+jawab1);
        System.out.println("Jawab:  "+jawab2);
        System.out.println("                    ="  +volume);
        
        
    }
    
}
