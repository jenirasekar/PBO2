package looping;

import java.util.Scanner;
public class loopingDoWhile {
    public static void main(String args[]) {
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while(running) {
            System.out.println("Apakah Anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]");
            jawab = scan.nextLine();
            //cek jawabannya, jika ya maka berhenti mengulang
            if(jawab.equalsIgnoreCase("ya")) {
                running = false;
            }
                counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak" 
                + counter + "kali");
    }
}
