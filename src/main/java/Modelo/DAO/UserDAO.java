package Modelo.DAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.BusinessEntity.UserBE;
import java.sql.ResultSet;


public class UserDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public UserBE Login(String user, String pass){
       UserBE userBE = new UserBE();
       String sql = "SELECT * FROM USERS WHERE EMAIL = ? AND PASSWORD = ?";
       try{
           userBE.setName("Santiago");
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.setString(1, user);
           ps.setString(2, pass);
           rs = ps.executeQuery();
           while(rs.next()){
               userBE.setName(rs.getString("USER"));
               userBE.setEmail(rs.getString("EMAIL"));
               userBE.setUserId(rs.getInt("USERID"));
           }
           rs.close();
           ps.close();
           con.close();    
       }catch(Exception e){
       
       }
       return userBE;
    }
    
}
