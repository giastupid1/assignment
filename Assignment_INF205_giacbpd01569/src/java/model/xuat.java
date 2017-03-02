/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
@WebServlet(name = "xuat", urlPatterns = {"/xuat"})
public class xuat extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static public String userr = "";
    static public String passs = "";
    static public String hotenn = "";
    static public String sodtt = "";
    static public String socmndd = "";
    static public String diachii = "";
    static public String maill = "";
    static public String ac = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            userr = request.getParameter("userr");
            ac = request.getParameter("ac");
            if (ac.equals("0")) {
                try {
                    /* TODO output your page here. You may use following sample code. */
                    Statement st = controller.connectcsdl.connectcsdl().createStatement();
                    ResultSet rs = st.executeQuery("select * from taikhoan where tendn='" + userr + "'");

                    if (rs.next()) {
                        passs = rs.getString(2);
                        hotenn = rs.getString(4);
                        sodtt = rs.getString(6);
                        socmndd = rs.getString(8);
                        diachii = rs.getString(5);
                        maill = rs.getString(7);

                    } else {
                        userr = "";
                        passs = "";
                        hotenn = "";
                        sodtt = "";
                        socmndd = "";
                        diachii = "";
                        maill = "";
                    }
                    
                    response.sendRedirect("quantri.jsp");

                } catch (Exception ex) {
                    Logger.getLogger(xuat.class.getName()).log(Level.SEVERE, null, ex);
                }
                ///neu trang thai khac 0
            } else if (ac.equals("1")) {

                String user = request.getParameter("userr");
                String pass = request.getParameter("passs");
                String hoten = request.getParameter("hotenn");
                String sodt = request.getParameter("sodtt");
                String socmnd = request.getParameter("socmndd");
                String diachi = request.getParameter("diachii");
                String email = request.getParameter("maill");
                try {

                   PreparedStatement pr=controller.connectcsdl.connectcsdl().prepareStatement("insert into taikhoan values(?,?,?,?,?,?,?,?)");
            pr.setString(1, user);
            pr.setString(2, pass);
            pr.setString(3, "0");
            pr.setNString(4, hoten);
            pr.setNString(5, diachi);
            pr.setString(6, sodt);
            pr.setString(7, email);
            pr.setString(8, socmnd);
            pr.executeUpdate();
                    response.sendRedirect("quantri.jsp");
                } catch (Exception ex) {

                }
            } else if (ac.equals("2")) {
                String user = request.getParameter("userr");
                String pass = request.getParameter("passs");
                String hoten = request.getParameter("hotenn");
                String sodt = request.getParameter("sodtt");
                String socmnd = request.getParameter("socmndd");
                String diachi = request.getParameter("diachii");
                String email = request.getParameter("maill");

                try {

                    PreparedStatement pr = controller.connectcsdl.connectcsdl().prepareStatement("update taikhoan set pass = ?, hoten= ?  , sodt = ?, cmnd = ? , diachi=?,email=? where tendn=? ");
                    pr.setString(1, pass);
                    pr.setString(2, hoten);
                    pr.setString(3, sodt);
                    pr.setString(4, socmnd);
                    pr.setString(5, diachi);
                    pr.setNString(6, email);
                    pr.setString(7, user);

                    pr.executeUpdate();

                    Statement st = controller.connectcsdl.connectcsdl().createStatement();
                    ResultSet rs = st.executeQuery("select * from taikhoan where tendn='" + user + "'");
                    if (rs.next()) {
                        passs = rs.getString(2);
                        hotenn = rs.getString(4);
                        sodtt = rs.getString(6);
                        socmndd = rs.getString(8);
                        diachii = rs.getString(5);
                        maill = rs.getString(7);
                    } else {
                        userr = "";
                        passs = "";
                        sodtt = "";
                        socmndd = "";
                        diachii = "";
                        maill = "";
                    }

                    response.sendRedirect("quantri.jsp");
                } catch (Exception ex) {
                    out.println(ex);
                }

            } else if (ac.equals("3")) {
                userr = request.getParameter("userr");

                try {

                    PreparedStatement pr = controller.connectcsdl.connectcsdl().prepareStatement("delete from taikhoan where tendn= ?");
                    pr.setString(1, userr);
                    pr.executeUpdate();
                    userr = "";
                    passs = "";
                    hotenn = "";
                    sodtt = "";
                    socmndd = "";
                    diachii = "";
                    maill = "";
                    response.sendRedirect("quantri.jsp");
                } catch (Exception ex) {

                }
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
