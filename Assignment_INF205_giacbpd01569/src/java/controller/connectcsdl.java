/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Product;



/**
 *
 * @author Admin
 */
public class connectcsdl {
    static Connection con;
    static String dbName;
    static String user;
    static String pass;

     public static Connection connectcsdl() {
         
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Assjv4z;user=sa;password=sa;");
        }catch(Exception ex){
                System.out.println(ex);
                }
        return con;
    }
public int login(String user,String pass){
    try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from taikhoan where tendn='"+user+"'and pass='"+pass+"'");
        if(rs.next()){
            if(rs.getString(3).equals("admin"))
                return 1;
            else
                return 2;
        }else{
            return 0;
        }
    }catch(Exception ex){
        ex.printStackTrace();
        return 0;
    }
}   
public int insertProduct(Product obj){
    try{
        Statement st = con.createStatement();
        int i=st.executeUpdate("Insert into sanpham values('"+obj.getMasp()+"','"+obj.getTensp()+"','"+obj.getMota()+"','"+obj.getSl()+"','"+obj.getDongia()+"','"+obj.getHinhanh()+"','"+obj.getNhasx()+"','"+obj.getMaloai()+"')");
        st.close();
        return i;
    }catch(SQLException ex){
       return 0;
    }
}
}
