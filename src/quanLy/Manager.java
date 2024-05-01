package quanLy;

public class Manager extends NhanVien{
	public Manager() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public void nhapNhanVien() {
		// TODO Auto-generated method stub
		super.nhapNhanVien();
	}
	@Override
	public float luongNhanVien() {
		// TODO Auto-generated method stub
		return super.getLuongCoBan()*super.getHeSoLuong();
	}
}
