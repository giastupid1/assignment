/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "xuatsp", urlPatterns = {"/xuatsp"})
public class xuatsp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     static public String maspp="";
    static public String maloaii="";
    static public String tenspp="";
    static public String nhasxx="";
    static public int dongiaa;
    static public String fileanhh="";
    static public String ac="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
       response.setContentType("text/html;charset=UTF-8");
        ac=request.getParameter("ac");
        PrintWriter out=response.getWriter();
        if(ac.equals("0")){
            maspp =request.getParameter("maspp");
            try {
                Statement st=controller.connectcsdl.connectcsdl().createStatement();
                ResultSet rs=st.executeQuery("select * from sanpham where masp='"+maspp+"'");
                if(rs.next()){
                    maloaii=rs.getString(8);
                    tenspp=rs.getNString(2);
                    nhasxx=rs.getString(7);
                    dongiaa= Integer.parseInt(rs.getString(5));
                    fileanhh = rs.getString(6);
                    
                }else{
                   maloaii ="";
                    tenspp="";
                    nhasxx="";
                    dongiaa= Integer.parseInt("0");
                    
                }response.sendRedirect("quantrisanpham.jsp");
            } catch (SQLException ex) {
                
            }
        }else if(ac.equals("1")){
            maspp=request.getParameter("maspp");
            maloaii=request.getParameter("maloaii");
            tenspp=request.getParameter("tenspp");
            nhasxx=request.getParameter("nhasxx");
            dongiaa= Integer.parseInt(request.getParameter("dongiaa"));
            fileanhh=request.getParameter("fileanhh");
            try {
                PreparedStatement pr=controller.connectcsdl.connectcsdl().prepareStatement("insert into sanpham values(?,?,?,?,?,?,?,?)");
                pr.setString(1, maspp);
                pr.setString(2, tenspp);
                pr.setString(3, "0");
                pr.setString(4, "0");
                pr.setInt(5, dongiaa);
                pr.setString(6, fileanhh);
                pr.setString(7, nhasxx);
                pr.setString(8, maloaii);
                pr.executeUpdate();
                response.sendRedirect("quantrisanpham.jsp");
            } catch (Exception ex) {
            }  
            }else if(ac.equals("2")){
                   
                   String masp=request.getParameter("maspp");
            String maloai=request.getParameter("maloaii");
            String tensp=request.getParameter("tenspp");
            String nhasx=request.getParameter("nhasxx");
            int dongia= Integer.parseInt(request.getParameter("dongiaa"));
            String fileanh=request.getParameter("fileanhh");
            try {
                PreparedStatement pr=controller.connectcsdl.connectcsdl().prepareStatement("update sanpham set  tensp= ?  , mota = ?, soluong = ? , dongia=?, hinhanh=?, nhasx=?, maloai=? where masp=?");
                pr.setString(1, tensp);
                pr.setString(2, "0");
                pr.setString(3, "0");
                pr.setInt(4, dongia);
                pr.setString(5, fileanh);
                pr.setString(6, nhasx);
                pr.setString(7, maloai);
                 pr.setString(8, masp);
                pr.executeUpdate();
                 Statement st = controller.connectcsdl.connectcsdl().createStatement();
                    ResultSet rs = st.executeQuery("select * from sanpham where masp='" + maspp + "'");
                    if (rs.next()) {
                        maloaii=rs.getString(8);
                    tenspp=rs.getNString(2);
                    nhasxx=rs.getString(7);
                    dongiaa= Integer.parseInt(rs.getString(5));
                    fileanhh = rs.getString(6);
                    } else {
                         maloaii="";
                    tenspp="";
                    nhasxx="";
                    dongiaa= Integer.parseInt(rs.getString(""));
                    fileanhh = "";
                    }

                    response.sendRedirect("quantrisanpham.jsp");
                    }catch(Exception e){
                        out.println(e);
                    }
            }else if(ac.equals("3")){
                    String  masp = request.getParameter("maspp");
                     try {

                    PreparedStatement pr = controller.connectcsdl.connectcsdl().prepareStatement("delete from sanpham where masp= ?");
                    pr.setString(1, masp);
                    pr.executeUpdate();
                      maloaii="";
                    tenspp="";
                    nhasxx="";
                     dongiaa= Integer.parseInt("0");
                    fileanhh = "";
                    response.sendRedirect("quantrisanpham.jsp");
                } catch (Exception ex) {

                }
                    
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(xuatsp.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(xuatsp.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
