/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.BusinessEntity.ProductBE;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author Santiago Hernandez
 */
public class ProductDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List<ProductBE> UserSelectCommand(){
       List<ProductBE> list = new ArrayList();
       ProductBE userBE = new ProductBE();
       String sql = "SELECT * FROM PRODUCTOS";
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               //userBE.setName(rs.getString("USER"));
               //userBE.setEmail(rs.getString("EMAIL"));
               //userBE.setUserId(rs.getInt("USERID"));
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
}
