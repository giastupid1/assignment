<%-- 
    Document   : index
    Created on : Oct 19, 2016, 3:47:08 PM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<html>
    <head>
        <meta charset = "UTF-8" />
        <title>Đổi mật khẩu</title>
        <link href="css/styleindex.css" rel="stylesheet" type="text/css" /> 
        <link href="css/LightboxEvolution.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
        <script type="text/javascript" src="js/javascript.js"></script>
        <script type="text/javascript" src="js/LightboxEvolution.js"></script>
        <script type="text/javascript" src="js/LightboxEvolution2.js"></script>
        <script type="text/javascript" src="js/LightboxEvolution3.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {
                jQuery('.lightbox').lightbox();
            });
        </script>
    </head>
    <body onLoad="load()">
        <div class="border">
            <div class="wrapper">
                <div class="top">
                    <div class="logo"><img src="images/logo.jpg" height="150px" width="300px" ></div>
                    <div class="sreach">
                        <div class="sreach1">
                            <form>
                                <input type="text" placeholder="Bạn muốn tìm gì ?" style="width:400px;height:34px;float:left;"> <input type="submit" value="Tìm kiếm" style="height:34px;background:#d41212;border:1px solid #d41212;"/>
                            </form>
                        </div>
                       
                    </div>
                     <div class="menu">
                        <span id="house"><img src="images/home.jpg" height="40px" width="40px" /></span>
                        <div class="menu1"><a href="index.jsp"><b>TRANG CHỦ</b></a></div>
                        <div class="menu1"><a href="muahang.jsp"><b>ĐIỆN THOẠI</b></a>
                            <div class="sub-menu">
                                <div class="menu2"><a href=""><b>» Nokia</b></a></div>
                                <div class="menu2"><a href="#"><b>» Iphone</b></a>
                                    <div class="menu3">
                                        <div class="menu3-1"><a href="#"><b>» Iphone 7</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Iphone 6</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Iphone 5</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Iphone 4</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Iphone other</b></a></div>
                                    </div>
                                </div>
                                <div class="menu2"><a href="#"><b>» Samsung</b></a>
                                    <div class="menu3">
                                        <div class="menu3-1"><a href="#"><b>» Samsung J</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Samsung Note</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Samsung A</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Samsung Other</b></a></div>
                                    </div>
                                </div>
                                <div class="menu2"><a href="#"><b>» Asus</b></a>
                                    <div class="menu3">
                                        <div class="menu3-1"><a href="#"><b>» Zenfone6</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Zenfone5</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Zenfone4,5</b></a></div>
                                        <div class="menu3-1"><a href="#"><b>» Zenfone4</b></a></div>


                                    </div>
                                </div>
                                <div class="menu2"><a href="#"><b>» HTC</b></a></div>
                                <div class="menu2"><a href="#"><b>» LG</b></a></div>
                            </div>

                        </div>
                        <div class="menu1"><a href=""><b>KHUYẾN MÃI</b></a>

                        </div>
                         <div class="menu1"<%=model.dangnhap.display%> ><a href="dangnhap.jsp" class="DK">ĐĂNG NHẬP</a>-<a class="DK" href="dangki.jsp">ĐĂNG KÍ</a></div>
                           <div class="menu1" <%=model.dangnhap.displayDN%>><%=model.dangnhap.userN%>
                           <div class="sub-menu">
                                    <div class="menu2"><a href="giohang"><b>» Giỏ hàng</b></a></div>
                                    <div class="menu2"><a href="thongtin"><b>» Thông tin</b></a></div>
                                    <div class="menu2"><a href="doipass.jsp"><b>» Đổi mật khẩu</b></a></div>
                                    <div class="menu2"><a href="dangxuat"><b>» Log out.</b></a></div>
                           </div>
                                        </div>
                                    </div></div>
               
                <div class="content">
                 <form action="doipass" method="post">
<table align="center" style="text-align:right">
<tr>
<td width="104" height="50">Mật khẩu mới:</td>
<td width="140"><input type="password" id="mk" name="mk"></td>
</tr>

<tr><td height="50">Nhập lại mật khẩu:</td><td><input type="password" name="nlmk" id="nlmk"></td></tr>
<tr><td></td><td align="left">
<tr><td></td><td><input type="submit" id="sm" value="Thay đổi" onmouseover="ktpass()"> </td></tr>    
  
<tr height="50"><td></td><td height="50"></td></tr><tr height="50"><td></td><td height="50"></td></tr>
</table>
</form>
                                            </center>

                                            </div>
                                            <div class="footer">
                                                <center>Copyright &copy by <b>Gia Mắm</b></center>
                                                Giấy phép đăng ký số :... <br />
                                                <b>Biên tập</b>: Chế Bồng Gia ...  -<b>Phone:</b> 0972 135 386 - <b>Facbook</b>: <a href="http://facebook.com/gia124" title="Níck FB">Gia Mắm</a><br /><br />
                                                Công ty phân bối sản phản công nghệ CĐ TH FPT Polytechnic <br />
                                                <b>Địa chỉ : </b>137 Nguyễn Thị Thập - Phường Hoà Minh - Quận Liên Chiểu - TP Đà Nẵng. <br />		
                                                <b>Email : </b>giastupid1@gmail.com. <br />	
                                                <b>FAX : </b>0972 135 386. <br />	
                                                - .... <br />

                                            </div>
                                            </div>
                                            </div>
                                            </body>
                                            </html>
