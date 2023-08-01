package latihan;

public class ujiThrow {
    static void validasi(int usia) {
        if(usia < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("Selamat memilih!");
        }
    }
    public static void main(String[] args) {
        validasi(19);
        System.out.println("Akhir kode program");
    }
}
