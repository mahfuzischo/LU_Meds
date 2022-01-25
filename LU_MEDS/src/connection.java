/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author STACBD.COM
 */
import java.sql.*;
public class connection {
    
    
public Connection c;
    public Statement s;
 
    public connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project3","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
