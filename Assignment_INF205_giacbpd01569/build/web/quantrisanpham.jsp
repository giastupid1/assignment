<%-- 
    Document   : index
    Created on : Oct 19, 2016, 3:47:08 PM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<html>
    <head>
        <meta charset = "UTF-8" />
        <title>Quản trị sản phẩm</title>
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
                        <div class="menu1"><a href="quantri.jsp"><b>TÀI KHOẢN</b></a></div>

                        <div class="menu1"><a href="quantrisanpham.jsp"><b>SẢN PHẨM</b></a>

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
                <div class="content" align="center">
                    <h1> Thông tin sản phẩm</h1>
                    <script>
                        function ac0() {
                            var a0 = 0;
                            document.getElementById("ac").value = a0;

                        }
                        function ac1() {
                            var a1 = 1;
                            document.getElementById("ac").value = a1;
                        }
                        function ac2() {
                            var a2 = 2;
                            document.getElementById("ac").value = a2;
                        }
                        function ac3() {
                            var a3 = 3;
                            document.getElementById("ac").value = a3;
                        }
                       
                    </script>
                    <form action="xuatsp" method="post">
                        <table >
                            <tr>
                            <td></td>
                            <td ><h2>Quản lý sản phẩm</h2></td>
                            </tr>
                            <tr>
                            <td  style="text-align:right;">Mã sản phẩm</td>
                            <td ><input type="text" name="maspp" value="<%=model.xuatsp.maspp%>"/> <input type="submit" value="Tìm " onclick="ac0()"></td>
                            </tr>

                            <tr>
                            <td style="text-align:right;">Mã loại:</td>
                            <td><input type="text" name="maloaii" value="<%=model.xuatsp.maloaii%>"/></td>
                            </tr>
                            <tr>
                            <td  style="text-align:right;">Tên sản phẩm:</td>
                            <td><input type="text" name="tenspp" value="<%=model.xuatsp.tenspp%>"/></td>
                            </tr>
                            <tr>
                            <td style="text-align:right;">Ngày sản xuất:</td>
                            <td><input type="date" name="nhasxx" value="<%=model.xuatsp.nhasxx%>"/></td>
                            </tr>
                            <tr>
                            <td style="text-align:right;">Đơn giá:</td>
                            <td><input type="number" name="dongiaa" value="<%=model.xuatsp.dongiaa%>"/></td>
                            </tr>
                            <tr>
                            <td style="text-align:right;">File ảnh:</td>
                            <td><input type="text" name="fileanhh" /></td>
                            </tr> 
                           <tr>
                            <td></td>
                            <td ><input type="submit" value="Thêm" onclick="ac1()">  <input type="submit" value=" Sửa " onclick="ac2()">  <input type="submit" value=" Xóa " onclick="ac3()"></td>
                            </tr>

                        </table>
                        <input type="text" value="" style="display: none" id="ac" name="ac">
                    </form>
                </div>
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
