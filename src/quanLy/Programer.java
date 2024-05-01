package quanLy;

import java.util.Scanner;

public class Programer extends NhanVien {
private float tienLuongOverTime;

public Programer(Scanner scanner, String maNhanVien, String tenNhanVien, String ngayThangNamSinhString,
		String diaChiString, int heSoLuong, String ngayBatDauLamViec, float luongCoBan, float tienLuongOverTime) {
	super(scanner, maNhanVien, tenNhanVien, ngayThangNamSinhString, diaChiString, heSoLuong, ngayBatDauLamViec,
			luongCoBan);
	this.tienLuongOverTime = tienLuongOverTime;
}

public Programer( ) {
	super( );
}


public float getTienLuongOverTime() {
	return tienLuongOverTime;
}

public void setTienLuongOverTime(float tienLuongOverTime) {
	this.tienLuongOverTime = tienLuongOverTime;
}

@Override
	public String toString() {
		 
		return super.toString()+" , tien Luong OverTime: "+this.getTienLuongOverTime();
	}

@Override
	public void nhapNhanVien() {
		// TODO Auto-generated method stub
		super.nhapNhanVien();
		System.out.println("nhap luong over time: ");
		tienLuongOverTime=scanner.nextFloat();
	}
@Override
	public float luongNhanVien() {
		// TODO Auto-generated method stub
		return super.getLuongCoBan()*super.getHeSoLuong()+this.tienLuongOverTime;
	}
}
