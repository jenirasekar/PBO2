/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author ThinkPad T440s
 */
public class demo {
    public static void main(String[] args) {
        jurusan belajar = new jurusan();
        jurusan rpl =new rpl();
        jurusan tkj =  new tkj();
        jurusan mm = new mm();
        
        belajar.mapel();
        rpl.mapel();
        tkj.mapel();
        mm.mapel();
    }
}
