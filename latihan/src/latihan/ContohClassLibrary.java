package latihan;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ContohClassLibrary {
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {
        String nis, nama;
        double tugas, uts, uas, akhir;
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("NIS: ");
        nis = sc.next();
        System.out.println("Nama siswa: ");
        nama = sc.next();
        System.out.println("Nilai tugas: ");
        tugas = sc.nextInt();
        System.out.println("Nilai UTS:");
        uts = sc.nextInt();
        System.out.println("Nilai UAS:");
        uas = sc.nextInt();
        akhir = (tugas + uts + uas) / 3;
        System.out.println("=======================");
        System.out.println();
        System.out.println();
        System.out.println("DATA NILAI AKHIR SISWA");
        System.out.println("-----------------------");
        System.out.println("NIS: " + nis );
        System.out.println("Nama: " + nama);
        System.out.println("Nilai tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Nilai akhir: " + df2.format(akhir));
        System.out.println("-----------------------");

    }
}
