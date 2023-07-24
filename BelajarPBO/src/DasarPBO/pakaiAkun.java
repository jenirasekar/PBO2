package DasarPBO;
public class pakaiAkun {
    public static void main(String[] args) {
        akun akunku = new akun();
        akun akunAnda = new akun();
        
        akunku.isiData("Jenira Sekar", "Beteng", 12345);
        akunku.tampil();
        akunAnda.isiData("Rahmat Rendy", "Kampung Baru", 123456);
        akunAnda.tampil();
    }
}
