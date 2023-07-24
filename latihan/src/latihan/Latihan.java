package latihan;

public class Latihan implements ContohInterface, TutupPesan{
    public static void main(String[] args) {
        Latihan ps = new Latihan();
        ps.tampilPesanPertama();
        ps.tampilPesanKedua();
        ps.penutup();
        ps.salam();


    }

    @Override
    public void tampilPesanPertama() {
        System.out.println("Tampilan Pesan Pertama");
    }

    @Override
    public void tampilPesanKedua() {
        System.out.println("Tampilan Pesan Kedua");
    }

    @Override
    public void penutup() {
        System.out.println("Terima kasih atas perhatiannya");
    }

    @Override
    public void salam() {
        System.out.println("Sampai jumpa");
    }
}
