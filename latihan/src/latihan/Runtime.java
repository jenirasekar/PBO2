package latihan;
import java.util.Scanner;

import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        try {
            int A, B;
            double C;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nilai A = ");
            A = sc.nextInt();
            System.out.println("Nilai B = ");
            B = sc.nextInt();
            C = A / B;
            System.out.println("Nilai A/B = " + C);
        }
        catch (Exception e) {
            System.out.println("Ada kesalahan");
            System.out.println("Tipe kesalahannya adalah " + e.getMessage());
        }
        finally {
            System.out.println("Blok finally selalu dieksekusi");
        }
    }
}
