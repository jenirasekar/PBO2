/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author ThinkPad T440s
 */
public class Kendaraan {
    String roda;
    String bbm;
    
    void info1() {
        System.out.println("Jumlah roda:    "   +roda);
        System.out.println("Bahan bakar :"  +bbm);
    }
}

class SepedaMotor extends Kendaraan {
    String jenis;
    void info2() {
        System.out.println("Jenis kendaraan :"  +jenis);
    }
}


