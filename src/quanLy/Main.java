package quanLy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NhanVienList nhanVienList = new NhanVienList();
		int luaChon = 0;
		do {
			System.out.println("1. them Nhan vien");
			System.out.println("2. xuat Danh Sach Nhan vien");
			System.out.println("3. xoa Nhan Vien ");
			System.out.println("4. sua Nhan Vien ");
			System.out.println("5. tim kiem nhan vien ");
			System.out.println("6. tong luong nhan vien 1 thang ");
			System.out.println("7. luong theo loai nhan vien ");
			System.out.println("0. thoat");
			System.out.println("nhap lua chon : ");
			luaChon = scanner.nextInt();
			scanner.nextLine();
			switch (luaChon) {
			case 1:
				nhanVienList.themSinhVien();
				break;
			case 2:
				nhanVienList.xuatDanhSach();
				break;
			case 3:
				nhanVienList.xoaNhanVien();
				break;
			case 4:
				nhanVienList.suaNhanVien();
				break;
			case 5:
				nhanVienList.timKiemNhanVien();
				break;
			case 6:
				nhanVienList.tongLuongNhanVienTheoThang();
				break;
			case 7:
				nhanVienList.luongNhanVienTheoLoai();
				break;

			default:
				break;
			}
		} while (luaChon != 0);
	}
}
