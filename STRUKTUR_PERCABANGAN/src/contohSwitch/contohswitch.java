package contohSwitch;
import java.util.Scanner;
public class contohswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the day :");
    int hari = input.nextInt();
    switch(hari) {
        case 1: System.out.println("hari ke-1 = Senin"); break;
        case 2: System.out.println("hari ke-2 = Selasa"); break;
        case 3: System.out.println("hari ke-3 = Rabu"); break;
        case 4: System.out.println("hari ke-4 = Kamis"); break;
        case 5: System.out.println("hari ke-5 = Jumat"); break;
        case 6: System.out.println("hari ke-6 = Sabtu"); break;
        case 7: System.out.println("hari ke-7 = Minggu"); break;
        
        default : System.out.println("Nilai case tidak terpenuhi");
    }
    }
}
