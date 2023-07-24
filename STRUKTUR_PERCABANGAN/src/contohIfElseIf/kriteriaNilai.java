package contohIfElseIf;
import java.util.Scanner;
public class kriteriaNilai {
    public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
    System.out.print("Nilai Anda :");
    int a = input.nextInt();
   
    int nilai = a;
    
    if(nilai > 90) {
        System.out.println("Anda Lulus Memuaskan!");
    } else if(nilai >= 60) {
        System.out.println("Anda Lulus!");
    } else{
        System.out.println("Anda Gagal!");
    }
    }
}
