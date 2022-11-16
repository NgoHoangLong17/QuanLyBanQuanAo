﻿USE MASTER 
GO

CREATE DATABASE QUANLYBANQUANAO
GO

USE QUANLYBANQUANAO
GO

CREATE TABLE SANPHAM(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE ANH(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE SIZE(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE NSX(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE DONGSP(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE MAUSAC(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE CHATLIEU(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE CHITIETSP(
	ID INT IDENTITY(1,1),
	IDSP INT,
	IDDONGSP INT,
	IDMAUSAC INT,
	IDCHATLIEU INT,
	IDSIZE INT,
	IDNSX INT,
	IDANH INT,
	SOLUONGTON INT,
	GIA INT,
	MOTA NVARCHAR(255),
	PRIMARY KEY(ID),
	FOREIGN KEY(IDSP) REFERENCES SANPHAM(ID),
	FOREIGN KEY(IDDONGSP) REFERENCES DONGSP(ID),
	FOREIGN KEY(IDMAUSAC) REFERENCES MAUSAC(ID),
	FOREIGN KEY(IDCHATLIEU) REFERENCES CHATLIEU(ID),
	FOREIGN KEY(IDSIZE) REFERENCES SIZE(ID),
	FOREIGN KEY(IDNSX) REFERENCES NSX(ID),
	FOREIGN KEY(IDANH) REFERENCES ANH(ID)
)
GO

CREATE TABLE CHUCVU(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE NHANVIEN(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	IDCHUCVU INT,
	GIOITINH BIT,
	NGAYSINH DATE,
	SDT NVARCHAR(10) UNIQUE NOT NULL,
	DIACHI NVARCHAR(255),
	MATKHAU NVARCHAR(255),
	DELETED BIT,
	PRIMARY KEY(ID),
	FOREIGN KEY(IDCHUCVU) REFERENCES CHUCVU(ID)
)
GO

CREATE TABLE KHUYENMAI(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	MUCGIAMGIA INT,
	NGAYBATDAU DATE,
	NGAYKETTHUC DATE,
	PRIMARY KEY(ID)
)
GO

CREATE TABLE TINHTRANG(
	ID INT IDENTITY(1,1),
	TEN NVARCHAR(255),
	PRIMARY KEY(ID)
)
GO

CREATE TABLE HOADON(
	ID INT IDENTITY(1,1),
	IDNHANVIEN INT,
	TENKHACHHANG NVARCHAR(255),
	SDT NVARCHAR(10),
	DIACHI NVARCHAR(255),
	NGAYTAO DATE,
	NGAYTHANHTOAN DATE,
	IDTINHTRANG INT,
	TONGTIEN INT,
	IDKHUYENMAI INT,
	TIENSAUGIAMGIA INT,
	PRIMARY KEY(ID),
	FOREIGN KEY(IDNHANVIEN) REFERENCES NHANVIEN(ID),
	FOREIGN KEY(IDKHUYENMAI) REFERENCES KHUYENMAI(ID),
	FOREIGN KEY(IDTINHTRANG) REFERENCES TINHTRANG(ID)
)
GO

CREATE TABLE HOADONCHITIET(
	IDHOADONCT INT IDENTITY(1,1),
	IDHOADON INT,
	IDCTSP INT,
	TENSP NVARCHAR(255),
	TENNSX NVARCHAR(255),
	DONGSP NVARCHAR(255),
	MAUSAC NVARCHAR(255),
	ANH NVARCHAR(255),
	SIZE NVARCHAR(255),
	SOLUONG INT,
	DONGIA INT,
	PRIMARY KEY(IDHOADONCT),
	FOREIGN KEY(IDHOADON) REFERENCES HOADON(ID),
	FOREIGN KEY(IDCTSP) REFERENCES CHITIETSP(ID)
)
GO

CREATE TABLE HANGTRA(
	ID INT IDENTITY(1,1),
	IDHOADON INT,
	IDCTSP INT,
	TENSP NVARCHAR(255),
	TENNSX NVARCHAR(255),
	DONGSP NVARCHAR(255),
	MAUSAC NVARCHAR(255),
	ANH NVARCHAR(255),
	SIZE NVARCHAR(255),
	SOLUONG INT,
	DONGIA INT,
	LYDO NVARCHAR(255),
	PRIMARY KEY(ID),
	FOREIGN KEY(IDCTSP) REFERENCES CHITIETSP(ID),
	FOREIGN KEY(IDHOADON) REFERENCES HOADON(ID),
)
GO

INSERT INTO SANPHAM VALUES(N'Quần jean')
INSERT INTO SANPHAM VALUES(N'Quần short')
INSERT INTO SANPHAM VALUES(N'Áo Polo')

INSERT INTO ANH VALUES('IMG1')
INSERT INTO ANH VALUES('IMG2')
INSERT INTO ANH VALUES('IMG3')

INSERT INTO SIZE VALUES('S')
INSERT INTO SIZE VALUES('M')
INSERT INTO SIZE VALUES('L')
INSERT INTO SIZE VALUES('XL')
INSERT INTO SIZE VALUES('XXL')

INSERT INTO NSX VALUES('NSX1')
INSERT INTO NSX VALUES('NSX2')
INSERT INTO NSX VALUES('NSX3')

INSERT INTO DONGSP VALUES(N'Sơ mi')
INSERT INTO DONGSP VALUES(N'Áo phông')
INSERT INTO DONGSP VALUES(N'Quần ship')





--USE MASTER
--GO
--DROP DATABASE QUANLYBANQUANAO
