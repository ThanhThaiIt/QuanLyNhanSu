package quanLy;

import java.util.Scanner;

public class NhanVien implements INhanVien  {
	Scanner scanner = new Scanner(System.in);
 private String maNhanVien;
 private String tenNhanVien;
 private String ngayThangNamSinhString;
 private String diaChiString;
 private float heSoLuong;
 private String ngayBatDauLamViec;
 private float luongCoBan;
 
public NhanVien(Scanner scanner, String maNhanVien, String tenNhanVien, String ngayThangNamSinhString,
		String diaChiString, float heSoLuong, String ngayBatDauLamViec, float luongCoBan) {
	super();
	this.scanner = scanner;
	this.maNhanVien = maNhanVien;
	this.tenNhanVien = tenNhanVien;
	this.ngayThangNamSinhString = ngayThangNamSinhString;
	this.diaChiString = diaChiString;
	this.heSoLuong = heSoLuong;
	this.ngayBatDauLamViec = ngayBatDauLamViec;
	this.luongCoBan = luongCoBan;
}
public NhanVien() {
	super();
}
public String getMaNhanVien() {
	return maNhanVien;
}
public void setMaNhanVien(String maNhanVien) {
	this.maNhanVien = maNhanVien;
}
public String getTenNhanVien() {
	return tenNhanVien;
}
public void setTenNhanVien(String tenNhanVien) {
	
	this.tenNhanVien = tenNhanVien;
}
public String getNgayThangNamSinhString() {
	return ngayThangNamSinhString;
}
public void setNgayThangNamSinhString(String ngayThangNamSinhString) {
	this.ngayThangNamSinhString = ngayThangNamSinhString;
}
public String getDiaChiString() {
	return diaChiString;
}
public void setDiaChiString(String diaChiString) {
	this.diaChiString = diaChiString;
}
public float getHeSoLuong() {
	return heSoLuong;
}
public void setHeSoLuong(float heSoLuong) {
	this.heSoLuong = heSoLuong;
}
public String getNgayBatDauLamViec() {
	return ngayBatDauLamViec;
}
public void setNgayBatDauLamViec(String ngayBatDauLamViec) {
	this.ngayBatDauLamViec = ngayBatDauLamViec;
}


public float getLuongCoBan() {
	return luongCoBan;
}
public void setLuongCoBan(float luongCoBan) {
	this.luongCoBan = luongCoBan;
}
 


@Override
public String toString() {
	return   " maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien
			+ ", ngayThangNamSinhString=" + ngayThangNamSinhString + ", diaChiString=" + diaChiString + ", heSoLuong="
			+ heSoLuong + ", ngayBatDauLamViec=" + ngayBatDauLamViec + ", luongCoBan=" + luongCoBan + "]";
}
@Override
public void nhapNhanVien() {
	scanner.nextLine();
	System.out.println("nhap Ma Nhan Vien: ");
	maNhanVien= scanner.nextLine();
	System.out.println(" nhap Ten Nhan Vien: ");
	tenNhanVien=scanner.nextLine();
	System.out.println("nhap ngay thang nam sinh: ");
	ngayThangNamSinhString= scanner.nextLine();
	System.out.println("nhap dia chi: ");
	diaChiString=scanner.nextLine();
	System.out.println("nhap he so luong: ");
	heSoLuong= scanner.nextFloat();
	System.out.println("nhap ngay bat dau lam viec: ");
	ngayBatDauLamViec=scanner.nextLine();
	scanner.nextLine();
	System.out.println("nhap luong co ban: ");
	luongCoBan=scanner.nextFloat();
	
}
@Override
public float luongNhanVien() {
	// TODO Auto-generated method stub
	return 0;
}
 
 
}
