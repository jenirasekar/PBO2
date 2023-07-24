/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohSwitch;
import java.util.Scanner;
public class bulanSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the month :");
        int month = input.nextInt();
        switch(month) {
            case 1: 
                System.out.println("the first month is January");
                break;
            case 2:
                System.out.println("the second month is February");
                break;
            case 3:
                System.out.println("the third month is March");
                break;
            case 4:
                System.out.println("the fourth month is April");
                break;
            case 5:
                System.out.println("the fifth month is May");
                break;
            case 6:
                System.out.println("the sixth month is June");
                break;
            case 7:
                System.out.println("the seventh month is July");
                break;
            case 8:
                System.out.println("the eighth month is August");
                break;
            case 9:
                System.out.println("the nineth month is September");
                break;
            case 10:
                System.out.println("the tenth month is October");
                break;
            case 11:
                System.out.println("the eleventh month is November");
                break;
            case 12:
                System.out.println("the twelveth month is December");
                break;
                
            default : System.out.println("no month was found");
            
            
        }
    }
}
