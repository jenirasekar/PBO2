package latihan;
import java.lang.Math;
public class ContohClassLibrary3 {
    public static void main(String[] args) {
        double w = Math.max(200, 300);
        double i = Math.min(200, 300);
        double n = Math.round(3.14);
        double a = Math.sin(Math.toRadians(30));
        double r = Math.cos(Math.toRadians(30));
        System.out.println("Nilai maksimal: " + w);
        System.out.println("Nilai minimal: " + i);
        System.out.println("Pembulatan: " + n);
        System.out.println("Sinus 30 = " + a);
        System.out.println("Cosinus 30 = " + r);
    }
}
