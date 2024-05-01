package quanLy;

import java.util.Scanner;

public class Tester extends NhanVien {
private float error;

public Tester(Scanner scanner, String maNhanVien, String tenNhanVien, String ngayThangNamSinhString,
		String diaChiString, int heSoLuong, String ngayBatDauLamViec, float luongCoBan, float error) {
	super(scanner, maNhanVien, tenNhanVien, ngayThangNamSinhString, diaChiString, heSoLuong, ngayBatDauLamViec,
			luongCoBan);
	this.error = error;
}

public Tester( ) {
	super( );
}

public float getError() {
	return error;
}

public void setError(float error) {
	this.error = error;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", so luong eror: "+this.getError();
	}

@Override
	public void nhapNhanVien() {
		// TODO Auto-generated method stub
		super.nhapNhanVien();
		System.out.println("nhap eror: ");
		error=scanner.nextFloat();
	}
@Override
	public float luongNhanVien() {
		// TODO Auto-generated method stub
		return super.getHeSoLuong()*super.getLuongCoBan()+(this.getError()*200);
	}

}
