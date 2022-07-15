/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.currencyconverter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionClass {
    
    Connection conn = null;
    
    public static Connection connectionDB(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:CurrencyConverterDB.db");
            System.out.println("Connection Successful");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection not successful: " + e);
            return null;
        }
    }
}

