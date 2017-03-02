CREATE DATABASE Assjv4z
use Assjv4z
CREATE TABLE taikhoan (
tendn nvarchar(30) PRIMARY KEY not null,
pass nvarchar(30),
vaitro nvarchar(30),
hoten nvarchar(50),
diachi nvarchar(50),
sodt nvarchar(11),
email nvarchar(50)
)
CREATE TABLE sanpham(
masp nchar(6) PRIMARY KEY not null,
tensp nvarchar(70),
mota text,
soluong int,
dongia int,
hinhanh nvarchar(255) ,
nhasx nvarchar(255) ,
maloai nchar(6)
)
CREATE TABLE loaisp(
maloai nchar(6) PRIMARY KEY not null,
tenloai nvarchar(60)
)
CREATE TABLE donhang(
madh int PRIMARY KEY not null,
makh nvarchar(30),
ngaydat date,
trangthai int
)
CREATE TABLE dhchitiet(
madhct int PRIMARY KEY not null,
madh int,
masp nchar(6),
sl int,
gia int
)
ALTER TABLE dhchitiet ADD CONSTRAINT fk_dh FOREIGN KEY(madh) REFERENCES donhang(madh);
ALTER TABLE dhchitiet ADD CONSTRAINT fk_dh1 FOREIGN KEY(masp) REFERENCES sanpham(masp);
ALTER TABLE sanpham ADD CONSTRAINT fk_ml FOREIGN KEY(maloai) REFERENCES loaisp(maloai);
INSERT INTO taikhoan values(N'gia1','123','kh',N'Chế Bồng Gia1',N'Gia Lai1','0972135385','gia@fpt.edu.vn'),
(N'gia','123','admin',N'Chế Bồng Gia',N'Gia Lai','0972135386','giacbpd01569@fpt.edu.vn')
InSERT INTO loaisp values('dt','Điện Thoại'),
('lt','Laptop')
INSERT INTO sanpham VALUES('dt1',N'Oppo F1s',N'Điện thoại', 100, 5990000,'oppof1s.jpg','Oppo','dt'),
('dt2',N'Iphone 7',N'Điện thoại', 100, 20000000,'iphone7.jpg','Apple','dt'),
('dt3',N'Iphone 7 Plus',N'Điện thoại', 100, 24000000,'iphone7plus.jpg','Apple','dt')
select masp,maloai,tensp,nhasx,PARSENAME(convert(varchar,convert(money,dongia),1),2 ) as donGia,hinhanh from sanpham; 
select * from sanpham

