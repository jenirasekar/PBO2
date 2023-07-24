package latihan;

public class Latihan implements ContohInterface{
    public static void main(String[] args) {
        Latihan ps = new Latihan();
        ps.tampilPesanPertama();
        ps.tampilPesanKedua();


    }

    @Override
    public void tampilPesanPertama() {
        System.out.println("Tampilan Pesan Pertama");
    }

    @Override
    public void tampilPesanKedua() {
        System.out.println("Tampilan Pesan Kedua");
    }
}
