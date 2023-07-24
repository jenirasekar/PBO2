/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author ThinkPad T440s
 */
public class overLoad {
    void ovlDemo(){
        System.out.println("Tidak ada parameter");
    }
    
    void ovlDemo(int a) {
        System.out.println("Satu parameter integer   " + a);
    }
    
    int ovlDemo(int a, int b) {
        System.out.println("Dua parameter integer   " + a + " " + b);
        return a+b;
    }
    
    double ovlDemo(double a, double b) {
        System.out.println("Dua parameter double    " + a + " " + b);
        return a+b;
    }
}
