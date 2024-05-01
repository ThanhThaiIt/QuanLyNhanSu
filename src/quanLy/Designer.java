package quanLy;

import java.util.Scanner;

public class Designer extends NhanVien {
private float bonus;

public Designer(Scanner scanner, String maNhanVien, String tenNhanVien, String ngayThangNamSinhString,
		String diaChiString, int heSoLuong, String ngayBatDauLamViec, float luongCoBan, float bonus) {
	super(scanner, maNhanVien, tenNhanVien, ngayThangNamSinhString, diaChiString, heSoLuong, ngayBatDauLamViec,
			luongCoBan);
	this.bonus = bonus;
}

public Designer( ) {
	super( );
}

public float getBonus() {
	return bonus;
}

public void setBonus(float bonus) {
	this.bonus = bonus;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" , tien bonus: "+this.getBonus();
	}
@Override
	public void nhapNhanVien() {
		// TODO Auto-generated method stub
		super.nhapNhanVien();
		System.out.println("nhap tien bonus: ");
		bonus=scanner.nextFloat();
	}
@Override
	public float luongNhanVien() {
		// TODO Auto-generated method stub
		return super.getLuongCoBan()*super.getHeSoLuong()+this.getBonus();
	}
}
