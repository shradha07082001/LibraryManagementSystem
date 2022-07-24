/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.exchange.portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author shrad
 */
public class Conn {
    static Connection con = null;
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","1234");
        }
        catch(ClassNotFoundException | SQLException ex) {
            System.out.println(""+ex);
        }
        return con;
            
        }
        
}
