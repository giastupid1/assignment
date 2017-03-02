<%-- 
    Document   : dangnhap
    Created on : Oct 3, 2016, 12:02:16 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<! DOCTYPE HTML >

<html>
    <head>
        <meta charset = "UTF-8" />
        <title>Đăng Nhập</title>
        <link href="css/styledangky.css" rel="stylesheet" type="text/css" /> 
        <script type="text/javascript" src="javascript/javascript.js"></script>
    </head>
    <body onLoad="setup()">
        <div class="border">
            <div class="wrapper">
                <div class="top">
                    <div class="logo"><img src=images/logo.jpg height="150px" width="300px"></div>
                    <div class="sreach">
                        <div class="sreach1">
                            <form>
                                <input type="text" placeholder="Bạn muốn tìm gì ?" style="width:400px;height:34px;float:left;"><input type="submit" value="Tìm kiếm" style="height:20px;background:#d41212;border:1px solid #d41212;"/>
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
                            
                        </div>
                    </div>
                    <div class="content">
                        <center><h2>ĐĂNG NHẬP</h2></center><hr />
                        <form method="post" action="dangnhap">
                            <table align="center" style="text-align:right">
                                <tr>
                                    <td >Tên đăng nhập:</td>
                                    <td ><input type="text" id="t1" name="t1"></td>
                                </tr>

                                <tr><td >Mật khẩu:</td><td><input type="password" id="t2" name="t2"></td></tr>
                                <tr><td></td><td align="left"><p>
                                            <input type="submit" value="Đăng nhập">     
                                            <input type="reset" value="Hủy">
                                        </p>
                                        <p>&nbsp;</p>
                                        <p>&nbsp;</p></td></tr>
                            </table>
                        </form>
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
                </body>
                </html>
