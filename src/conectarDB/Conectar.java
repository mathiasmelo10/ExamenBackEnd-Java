/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectarDB;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Dark Matth
 */
public class Conectar {
   public static final String URL = "jdbc:mysql://localhost:3306/pruebajava";
    public static final String USER = "root";
    public static final String CLAVE = "admin.root";
     
    public Connection getConexion(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
           
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error: " + ex.getMessage());
         
        }
        return conn;
    }
}

