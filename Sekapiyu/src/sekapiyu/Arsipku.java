package sekapiyu;

public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku skpy = new Arsipku();
        skpy.nama();
        skpy.tempatLahir();
        skpy.hobi();
        skpy.agama();
        skpy.BahasaIndonesia();
        skpy.Matematika();

    }

    @Override
    public void nama() {
        System.out.println("Namaku Jenira");
    }

    @Override
    public void tempatLahir() {
        System.out.println("Aku lahir di puskesmas Tanggul");
    }

    @Override
    public void hobi() {
        System.out.println("Hobiku mencintai Niall James Horan");
    }

    @Override
    public void agama() {
        int agama = 90;
        System.out.println("Nilai agamaku " + agama);
    }

    int bin = 80;
    public void BahasaIndonesia() {
        System.out.println("Nilai bahasa Indonesiaku " + bin);
    }

    int mtk = 80;
    public void Matematika() {
        System.out.println("Nilai matematikaku " + mtk);
    }
}
