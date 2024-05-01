package quanLy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NhanVienList {
	Scanner scanner= new Scanner(System.in);
ArrayList<NhanVien> nhanVienList= new ArrayList<NhanVien>();

public NhanVienList(ArrayList<NhanVien> nhanVienList) {
	super();
	this.nhanVienList = nhanVienList;
}

public NhanVienList() {
	super();
}

public ArrayList<NhanVien> getNhanVienList() {
	return nhanVienList;
}

public void setNhanVienList(ArrayList<NhanVien> nhanVienList) {
	this.nhanVienList = nhanVienList;
}

public void themSinhVien() {
	int luaChon;
	do {
		
	
	System.out.println("1. nhap Manager. ");
	System.out.println("2. nhap Prrogrramer. ");
	System.out.println("3. nhap Designer. ");
	System.out.println("4. nhap Tester. ");
	System.out.println("0. quay lai chuuong trinh chinh.");
	System.out.println("hay nhap lua chon Nhan Vien: ");
	luaChon=scanner.nextInt();
	switch (luaChon) {
	case 1:
		Manager manager= new Manager();
		manager.nhapNhanVien();
		nhanVienList.add(manager);
		break;
	case 2:
		Programer programer = new Programer();
		programer.nhapNhanVien();
		nhanVienList.add(programer);
		break;
	case 3:
		Designer designer = new Designer();
		designer.nhapNhanVien();
		nhanVienList.add(designer);
		break;
	case 4:
		Tester tester = new Tester();
		tester.nhapNhanVien();
		nhanVienList.add(tester);
		break;
	default:
		break;
	}
	
	} while (luaChon!=0);
}
public void xoaNhanVien() {
	int check=1;
	for (int i = 0; i < nhanVienList.size(); i++) {
		System.out.println((i+1)+" "+nhanVienList.get(i).toString() );
	}
	System.out.println(" nhap luua hon nhan viên muon xoa: " );
	int luaChon=(scanner.nextInt()-1);
	 for (int i = 0; i < nhanVienList.size(); i++) {
		if (nhanVienList.indexOf(nhanVienList.get(i))==luaChon) {
			nhanVienList.remove(nhanVienList.get(i));
		}
	}	
	 if (check==2) {
		System.out.println("xoa thanh cong");
	}else {
		System.out.println("xoa that bai");
	}
}

public void suaNhanVien() {
	int check=1;
	System.out.println("nhap ma nhan vien: ");
	String maString= scanner.nextLine();
	for (NhanVien nhanVien : nhanVienList) {
		if (nhanVien.getMaNhanVien().equals(maString)) {
			System.out.println("/n thong tin nhan vien muon sua /n "+nhanVien.toString() );
			break;
		}
	}
	
	for (NhanVien nhanVien : nhanVienList) {
		if (nhanVien.getMaNhanVien().equals(maString)) {
			scanner.nextLine();
			System.out.println("nhap ma nhan vien moi: ");
			String maMoi = scanner.nextLine();
			nhanVien.setMaNhanVien(maMoi);
			System.out.println("nhap ho va ten moi: ");
			String tenMoiString = scanner.nextLine();
			nhanVien.setTenNhanVien(tenMoiString);
			System.out.println("nhap ho va ten moi: ");
			String ngayThangMoi = scanner.nextLine();
			nhanVien.setNgayThangNamSinhString(ngayThangMoi);
			System.out.println("nhap dia chi moi: ");
			String diaChiMoi = scanner.nextLine();
			nhanVien.setDiaChiString(diaChiMoi);
			System.out.println("nhap he so luong moi: ");
			float heSOMoi=scanner.nextFloat();
			nhanVien.setHeSoLuong(heSOMoi);
			scanner.nextLine();
			System.out.println("nhap ngay bat dau moi: ");
			String ngayMoi = scanner.nextLine();
			nhanVien.setNgayBatDauLamViec(ngayMoi);
			System.out.println("nhap luong co ban moi: ");
			float luongCBMOI=scanner.nextFloat();
			nhanVien.setLuongCoBan(luongCBMOI);
		}
	}
}

public void timKiemNhanVien() {
	System.out.println("nhap ma nhan vien: ");
	String maString= scanner.nextLine();
	for (NhanVien nhanVien : nhanVienList) {
		if (nhanVien.getMaNhanVien().equals(maString)) {
			System.out.println("/n thong tin nhan vien ban tim kiem /n "+nhanVien.toString() );
			break;
		}
	}
}
public void xuatDanhSach() {
	for (NhanVien nhanVien : nhanVienList) {
		System.out.println(nhanVien.toString() );
	}
}
public void tongLuongNhanVienTheoThang() {
	int tong=0;
	for (NhanVien nhanVien : nhanVienList) {
		float bien= nhanVien.luongNhanVien();
		tong+=bien;
	}
	
	System.out.println(" tong luong nhan vien phai tra trong 1 thang la: "+ tong);
}

public void luongNhanVienTheoLoai() {
	float luong=0;
	String tenLoaiNhanVienString="";
	for (int i = 0; i < nhanVienList.size(); i++) {
		System.out.println((i+1)+" "+nhanVienList.get(i).toString());
	}		
	System.out.println("nhap loai nhan vien: ");
	int luaChon=(scanner.nextInt()-1);
	for (int i = 0; i < nhanVienList.size() ; i++) {
		if (nhanVienList.indexOf(nhanVienList.get(i))==luaChon) {//lấy vị trí
			
		
		if (nhanVienList.get(i) instanceof Manager) {
			tenLoaiNhanVienString="Manager";
		luong=	nhanVienList.get(i).luongNhanVien();
		break;
		}
		if (nhanVienList.get(i) instanceof Designer) {
			tenLoaiNhanVienString="Designer";
			luong=	nhanVienList.get(i).luongNhanVien();
			break;
		}
		if (nhanVienList.get(i) instanceof Programer) {
			tenLoaiNhanVienString="Programer";
			luong=	nhanVienList.get(i).luongNhanVien();
			break;
		}
		if (nhanVienList.get(i) instanceof Tester) {
			tenLoaiNhanVienString="Tester";
			luong=	nhanVienList.get(i).luongNhanVien();
			break;
		}
		}
	}
	System.out.println("luong cua "+tenLoaiNhanVienString+ "la :"+luong);
	
}

}
