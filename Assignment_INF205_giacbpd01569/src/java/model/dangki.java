/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "dangki", urlPatterns = {"/dangki"})
public class dangki extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String user=request.getParameter("user");
        String pass=request.getParameter("pass");
        String hoten=request.getParameter("hoten");
        String sodt=request.getParameter("sodt");
        String cmnd=request.getParameter("socmnd");
        String diachi=request.getParameter("diachi");
        String email=request.getParameter("email");
        
        try {
            
            
            PreparedStatement pr=controller.connectcsdl.connectcsdl().prepareStatement("insert into taikhoan values(?,?,?,?,?,?,?,?)");
            pr.setString(1, user);
            pr.setString(2, pass);
            pr.setString(3, "0");
            pr.setNString(4, hoten);
            pr.setNString(5, diachi);
            pr.setString(6, sodt);
            pr.setString(7, email);
            pr.setString(8, cmnd);
            pr.executeUpdate();
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thành công.</h1>");
            out.println("<a href='index.jsp'>Trở lại trang chủ</a>");
            out.println("<p>"+hoten+"</p>");
        } catch (Exception ex) {
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thất bại.</h1>");
            out.println("<h3 style='color:#FF0004'>Sai thông tin hoặc tên đăng nhập đã tồn tại.</h3>");
            out.println("<a href='index.jsp'>Trở lại trang chủ</a>");
            
            
            
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
