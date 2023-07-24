package DasarPBO;
public class konsumsiBB {
    public static void main(String[] args) {
       mobilDemo satu = new mobilDemo();
       mobilDemo dua = new mobilDemo();
       double liter;
       int tempuh1, tempuh2;
       int jarak = 50;
       
       satu.isidata("Toyote", "Bensin", "2001", 15, 17);
       liter=satu.perluBahanBakar(jarak);
       dua.isidata("Hiro", "Solar", "2003", 25, 15);
       
        System.out.println();
        System.out.println("Perbandingan Konsumsi BBM Dua Mobil");
        System.out.println("___________________________________");
        System.out.println("Mobil Satu");
        System.out.println("Merek   :"+satu.merek);
        System.out.println("Bahan Bakar :"+satu.bahanBakar);
        System.out.println("Tahun Dibuat    :"+satu.tahunPembuatan);
        tempuh1 = satu.tempuh();
        System.out.print("Saat full tank, dapat menempuh jarak" + tempuh1); System.out.print(" km");
        System.out.print("Untuk jarak" + jarak +" km mobil saat perlu ");
        System.out.printf("%,.2f",liter); System.out.println(" liter");
        System.out.println();
        System.out.println("___________________________________");
        
        liter=dua.perluBahanBakar(jarak);
        
        System.out.println("Mobil Dua");
        System.out.println("Merek   :"+dua.merek);
        System.out.println("Bahan Bakar :"+dua.bahanBakar);
        System.out.println("Tahun Dibuat    :"+dua.tahunPembuatan);
        tempuh2 = satu.tempuh();
        System.out.print("Saat full tank, dapat menempuh jarak" + tempuh2); System.out.print(" km");
        System.out.print("Untuk jarak" + jarak +" km mobil saat perlu ");
        System.out.printf("%,.2f",liter); System.out.println(" liter");
        System.out.println();
        System.out.println("___________________________________");
    }
}
