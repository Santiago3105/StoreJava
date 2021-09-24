package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Santiago Hernandez
 */
public class Conexion {
    
    Connection con;
    String Url = "jdbc:mysql://localhost:3306/databasetienda";
    String User = "root";
    String Pass = "pass";
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(Url,User,Pass);
        } catch (Exception e) {
        }
        return con;
    }
}
