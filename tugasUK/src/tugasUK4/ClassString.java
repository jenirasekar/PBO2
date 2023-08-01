package tugasUK4;

public class ClassString {
    public static void main(String[] args) {
        String String1 = "SAYA";
        String String2 = "SISWA";
        String String3 = "SMK";
        String String4 = " SAYA";
        String String5 = "ANGKATAN";
        String String6 = "2019";
        String String7 = "Saya";

        String p = String1 + " " + String2 + " " + String3;
        System.out.println(p);

        String q = String1 + " " + String5 + " " + String6;
        System.out.println(q);

        String r = String7 + " " + String2.toLowerCase() + " " + String5.toLowerCase() + " " + String6;
        System.out.println(r);

        String s = String1.toLowerCase() + " " + String2.toLowerCase() + " " + String3.toLowerCase();
        System.out.println(s);

    }
}
