package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import model.*;

public final class quantri_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset = \"UTF-8\" />\n");
      out.write("        <title>Quản trị tài khoản</title>\n");
      out.write("        <link href=\"css/styleindex.css\" rel=\"stylesheet\" type=\"text/css\" /> \n");
      out.write("        <link href=\"css/LightboxEvolution.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/javascript.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/LightboxEvolution.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/LightboxEvolution2.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/LightboxEvolution3.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function () {\n");
      out.write("                jQuery('.lightbox').lightbox();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onLoad=\"load()\">\n");
      out.write("        <div class=\"border\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"top\">\n");
      out.write("                    <div class=\"logo\"><img src=\"images/logo.jpg\" height=\"150px\" width=\"300px\" ></div>\n");
      out.write("                    <div class=\"sreach\">\n");
      out.write("                        <div class=\"sreach1\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"text\" placeholder=\"Bạn muốn tìm gì ?\" style=\"width:400px;height:34px;float:left;\"> <input type=\"submit\" value=\"Tìm kiếm\" style=\"height:34px;background:#d41212;border:1px solid #d41212;\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"menu\">\n");
      out.write("                        <span id=\"house\"><img src=\"images/home.jpg\" height=\"40px\" width=\"40px\" /></span>\n");
      out.write("                        <div class=\"menu1\"><a href=\"index.jsp\"><b>TRANG CHỦ</b></a></div>\n");
      out.write("                        <div class=\"menu1\"><a href=\"quantri.jsp\"><b>TÀI KHOẢN</b></a></div>\n");
      out.write("\n");
      out.write("                        <div class=\"menu1\"><a href=\"quantrisanpham.jsp\"><b>SẢN PHẨM</b></a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu1\"><a href=\"dangnhap.jsp\"><b>ĐĂNG NHẬP</b></a>-<a href=\"dangki.jsp\"><b>ĐĂNG KÍ</b></a>\n");
      out.write("                            <div class=\"sub-menu\">\n");
      out.write("                                <div class=\"menu2\"><a href=\"giohang\"><b>» Giỏ hàng</b></a></div>\n");
      out.write("                                    <div class=\"menu2\"><a href=\"thongtin\"><b>» Thông tin</b></a></div>\n");
      out.write("                                        <div class=\"menu2\"><a href=\"doipass.jsp\"><b>» Đổi mật khẩu</b></a></div>\n");
      out.write("                                        <div class=\"menu2\"><a href=\"dangxuat\"><b>» Log out.</b></a></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div></div>\n");
      out.write("                <div class=\"content\" align=\"center\">\n");
      out.write("                    <h1> Thông tin tài khoản </h1>\n");
      out.write("                    <script>\n");
      out.write("                        function ac0() {\n");
      out.write("                            var a0 = 0;\n");
      out.write("                            document.getElementById(\"ac\").value = a0;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        function ac1() {\n");
      out.write("                            var a1 = 1;\n");
      out.write("                            document.getElementById(\"ac\").value = a1;\n");
      out.write("                        }\n");
      out.write("                        function ac2() {\n");
      out.write("                            var a2 = 2;\n");
      out.write("                            document.getElementById(\"ac\").value = a2;\n");
      out.write("                        }\n");
      out.write("                        function ac3() {\n");
      out.write("                            var a3 = 3;\n");
      out.write("                            document.getElementById(\"ac\").value = a3;\n");
      out.write("                        }\n");
      out.write("                      \n");
      out.write("                    </script>\n");
      out.write("                    <form action=\"xuat\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <table >\n");
      out.write("                            <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td width=\"288\"><h2>Quản lý khách hàng</h2></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td style=\"text-align:right;\">Tên đăng nhập:</td>\n");
      out.write("                            <td ><input type=\"text\" id=\"userr\" name=\"userr\" value=\"");
      out.print(model.xuat.userr);
      out.write("\" /> <input type=\"submit\" value=\"Tìm\" onclick=\"ac0()\"  ></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td  style=\"text-align:right;\">Mật khẩu:</td>\n");
      out.write("                            <td><input type=\"text\" id=\"passs\" name=\"passs\" value=\"");
      out.print(model.xuat.passs);
      out.write("\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td  style=\"text-align:right;\">Họ và tên:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"hotenn\" value=\"");
      out.print(model.xuat.hotenn);
      out.write("\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td  style=\"text-align:right;\">Số điện thoại:</td>\n");
      out.write("                            <td><input type=\"number\" name=\"sodtt\" value=\"");
      out.print(model.xuat.sodtt);
      out.write("\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td  style=\"text-align:right;\">Số CMND:</td>\n");
      out.write("                            <td><input type=\"number\" name=\"socmndd\" value=\"");
      out.print(model.xuat.socmndd);
      out.write("\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td  style=\"text-align:right;\">Địa chỉ:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"diachii\" value=\"");
      out.print(model.xuat.diachii);
      out.write("\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td style=\"text-align:right;\">Email:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"maill\" value=\"");
      out.print(model.xuat.maill);
      out.write("\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td ><input type=\"submit\" value=\"Thêm\" onclick=\"ac1()\" >  <input type=\"submit\" value=\" Sửa \" onclick=\"ac2()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"ac3()\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <input type=\"text\" value=\"\" style=\"display: none\" id=\"ac\" name=\"ac\"> \n");
      out.write("                    </form>\n");
      out.write("                           \n");
      out.write("                </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <center>Copyright &copy by <b>Gia Mắm</b></center>\n");
      out.write("                Giấy phép đăng ký số :... <br />\n");
      out.write("                <b>Biên tập</b>: Chế Bồng Gia ...  -<b>Phone:</b> 0972 135 386 - <b>Facbook</b>: <a href=\"http://facebook.com/gia124\" title=\"Níck FB\">Gia Mắm</a><br /><br />\n");
      out.write("                Công ty phân bối sản phản công nghệ CĐ TH FPT Polytechnic <br />\n");
      out.write("                <b>Địa chỉ : </b>137 Nguyễn Thị Thập - Phường Hoà Minh - Quận Liên Chiểu - TP Đà Nẵng. <br />\t\t\n");
      out.write("                <b>Email : </b>giastupid1@gmail.com. <br />\t\n");
      out.write("                <b>FAX : </b>0972 135 386. <br />\t\n");
      out.write("                - .... <br />\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
