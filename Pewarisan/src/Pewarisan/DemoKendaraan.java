/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author ThinkPad T440s
 */
public class DemoKendaraan {
    public static void main(String[] args) {
        SepedaMotor sm = new SepedaMotor();
        
        sm.roda="dua";
        sm.bbm="bensin";
        sm.jenis="sepeda motor";
        
        sm.info2();
        sm.info1();
    }
}
