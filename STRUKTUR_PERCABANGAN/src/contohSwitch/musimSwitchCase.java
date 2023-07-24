/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohSwitch;

import java.util.Scanner;

/**
 *
 * @author ThinkPad T440s
 */
public class musimSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the month :");
        int month = input.nextInt();
        switch(month) {
            case 12: 
               
            case 1:
               
            case 2:
                System.out.println("the season is winter");
            case 3:
                
            case 4:
                
            case 5:
                System.out.println("the season is spring");
            case 6:
             
            case 7:
               
            case 8:
                System.out.println("the season is summer");
                break;
            case 9:
               
            case 10:

            case 11:
                System.out.println("the season is autumn");
                break;
                
            default : System.out.println("no season was found");
            
            
        }
    }
}


