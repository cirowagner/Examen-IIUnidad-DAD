/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.examen_iiunidad_soap.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ziro
 */
public class Conexion {
    private static final String URL="jdbc:postgresql://ec2-3-231-82-226.compute-1.amazonaws.com:5432/d5b65rk6ipcnem";
    private static final String DRIVER ="org.postgresql.Driver";
    private static final String USER="fmclmqkapqhnny";
    private static final String PASS="b0e27b2658fd0dabd65dad25e930d34ae76c4d6089ff926c09a657f31e26d929";
    private static Connection cx = null;
    
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
    return cx;
    }
}
