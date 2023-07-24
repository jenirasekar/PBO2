
package STRUKTUR_IF;

import java.util.Scanner;
public class SEKAR {
      public static void main(String args[]) {
          Scanner input=new Scanner (System.in);
          System.out.print
                  ("Masukkan nilai Anda = ");
          int a=input.nextInt();
          
         
          int nilai=a;
          if(nilai >= 75) 
          {
          System.out.println("LULUS");
          }  
          else 
          {
            System.out.println("TIDAK LULUS");
          }  
        
}
}