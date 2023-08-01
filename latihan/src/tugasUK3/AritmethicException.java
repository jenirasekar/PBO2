package tugasUK3;
import java.util.Scanner;
public class AritmethicException {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                try {
                    System.out.print("Masukkan angka pertama: ");
                    int num1 = sc.nextInt();

                    System.out.print("Masukkan angka kedua: ");
                    int num2 = sc.nextInt();

                    int result1 = num1 / num2;
                    int result2 = num1 % num2;

                    System.out.println("Hasil pembagian: " + result1);
                    System.out.println("Hasil modulus: " + result2);

                } catch (Exception e) {
                    throw new ArithmeticException("Terjadi kesalahan " + e.getMessage());
                } finally {
                    System.out.println("Executed");
                }
        }
    }

