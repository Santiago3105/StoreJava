package Modelo.DAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.BusinessEntity.UserBE;
import java.sql.ResultSet;
import java.util.*;


public class UserDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public UserBE Login(String user, String pass){
       UserBE userBE = new UserBE();
       String sql = "SELECT * FROM Usuarios WHERE EMAIL = ? AND PASSWORD = ?";
       try{
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
            System.out.println(e.getMessage());
       }
       return userBE;
    }
    
    public List<UserBE> UserSelectCommand(){
       List<UserBE> list = new ArrayList();
       UserBE userBE = new UserBE();
       String sql = "SELECT * FROM USERS";
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               userBE.setName(rs.getString("USER"));
               userBE.setEmail(rs.getString("EMAIL"));
               userBE.setUserId(rs.getInt("USERID"));
               list.add(userBE);
           }
           rs.close();
           ps.close();
           con.close();   
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       return list;
    }
    
    public boolean Registro(UserBE NewUser){
        
        String sql="INSERT INTO usuarios (Nombre, Email,Contraseña) VALUES (?, ?, ?);";
        try{
            cn = new Conexion();
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,NewUser.getName());
            ps.setString(3,NewUser.getEmail());
            ps.setString(5,NewUser.getPasswor());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean UserUpdateCommand(UserBE NewUser){
        
        String sql="INSERT INTO usuarios (Nombre, Email,Contraseña) VALUES (?, ?, ?);";
        try{
            cn = new Conexion();
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,NewUser.getName());
            ps.setString(3,NewUser.getEmail());
            ps.setString(5,NewUser.getPasswor());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean UserDeleteCommand(int UserId){
        
        String sql="DELETE FROM usuarios WHERE UsuarioId = ?;";
        try{
            cn = new Conexion();
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,UserId);
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
}
