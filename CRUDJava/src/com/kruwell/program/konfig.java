/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwell.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class konfig {
    private static Connection MySQLconfig;
    
    public static Connection configDB()throws SQLException{
        try{
            
            String url = "jdbc:mysql://localhost:3306/crudjava";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLconfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("koneksi ke database gagal" + e.getMessage());
        }
        
        return MySQLconfig;
    }
    
}
