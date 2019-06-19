/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;

public class db_connect {
    Connection conn = null;
    
    public static Connection connectDB(){ 
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "12155");
        //JOptionPane.showMessageDialog(null, "Connected to database");
        return conn;
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
        return null;
    }
    
    }    
}
