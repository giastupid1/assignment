package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;

public final class muahang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset = \"UTF-8\" />\n");
      out.write("        <title>Trang Chủ</title>\n");
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
      out.write("                        <div class=\"formlogin\">\n");
      out.write("                            <a href=\"dangki.jsp\" ><b>Đăng Ký</b></a> | <a href=\"dangnhap.jsp\" ><b>Đăng Nhập</b></a>\n");
      out.write("                            <br />\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <span id=\"house\"><img src=\"images/home.jpg\" height=\"40px\" width=\"40px\" /></span>\n");
      out.write("                        <div class=\"menu1\"><a href=\"index.jsp\"><b>TRANG CHỦ</b></a></div>\n");
      out.write("                        <div class=\"menu1\"><a href=\"muahang.jsp\"><b> SẢN PHẨM </b></a>\n");
      out.write("                            <div class=\"sub-menu\">\n");
      out.write("                                <div class=\"menu2\"><a href=\"muahang.jsp\"><b>» Nokia</b></a></div>\n");
      out.write("                                <div class=\"menu2\"><a href=\"#\"><b>» Iphone</b></a>\n");
      out.write("                                    <div class=\"menu3\">\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 7</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 6</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 5</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 4</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Iphone other</b></a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"menu2\"><a href=\"#\"><b>» Samsung</b></a>\n");
      out.write("                                    <div class=\"menu3\">\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Samsung J</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Samsung Note</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Samsung A</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Samsung Other</b></a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"menu2\"><a href=\"#\"><b>» Asus</b></a>\n");
      out.write("                                    <div class=\"menu3\">\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Zenfone6</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Zenfone5</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Zenfone4,5</b></a></div>\n");
      out.write("                                        <div class=\"menu3-1\"><a href=\"#\"><b>» Zenfone4</b></a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"menu2\"><a href=\"#\"><b>» HTC</b></a></div>\n");
      out.write("                                <div class=\"menu2\"><a href=\"#\"><b>» LG</b></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu1\"><a href=\"\"><b>KHUYẾN MÃI</b></a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu1\"><a href=\"gioithieu.jsp\"><b>GIỚI THIỆU</b></a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    ");

                       
                        Statement st = controller.connectcsdl.connectcsdl().createStatement();
                        ResultSet rs = st.executeQuery("select masp,maloai,tensp,nhasx,PARSENAME(convert(varchar,convert(money,dongia),1),2 ) as donGia,hinhanh from sanpham ");
                    
      out.write("\n");
      out.write("                     \n");
      out.write("                    <h2><img src=\"images/muiten.gif\" /> Sản phẩm mới </h2>\n");
      out.write("                    <center>\n");
      out.write("                        ");

                                    while (rs.next()) {
      out.write("\n");
      out.write("                        <div class=\"product\">\n");
      out.write("                            <div class=\"product1\">\n");
      out.write("                               \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"anh\"><img src=images/");
      out.print(rs.getString(6));
      out.write(" width=\"100\" height=\"120\"/></div>\n");
      out.write("                                <div class=\"infomation\">\n");
      out.write("                                    <span class=\"gia\"><u>\tGiá:</u>");
      out.print(rs.getString(5));
      out.write(" <b></b></span><br />\n");
      out.write("                                    <span class=\"tensp\">");
      out.print(rs.getString(3));
      out.write("</span><br />\n");
      out.write("                                    <span class=\"\"> <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Đặt vào giỏ hàng\"</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                                                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                                            </center>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer\">\n");
      out.write("                                                <center>Copyright &copy by <b>Gia Mắm</b></center>\n");
      out.write("                                                Giấy phép đăng ký số :... <br />\n");
      out.write("                                                <b>Biên tập</b>: Chế Bồng Gia ...  -<b>Phone:</b> 0972 135 386 - <b>Facbook</b>: <a href=\"http://facebook.com/gia124\" title=\"Níck FB\">Gia Mắm</a><br /><br />\n");
      out.write("                                                Công ty phân bối sản phản công nghệ CĐ TH FPT Polytechnic <br />\n");
      out.write("                                                <b>Địa chỉ : </b>137 Nguyễn Thị Thập - Phường Hoà Minh - Quận Liên Chiểu - TP Đà Nẵng. <br />\t\t\n");
      out.write("                                                <b>Email : </b>giastupid1@gmail.com. <br />\t\n");
      out.write("                                                <b>FAX : </b>0972 135 386. <br />\t\n");
      out.write("                                                - .... <br />\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </body>\n");
      out.write("                                            </html>\n");
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
