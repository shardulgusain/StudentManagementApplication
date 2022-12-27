package com.student.manage;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GUSAIN
 */
class ConnectionProvider {

    Connection con;
    static Connection createC() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String password="root";
            
            Con=DriverManager.getConnection(url, user, password)
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    
}
