package tuan1_bai2_sinhVien;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT, diemTH;
	
	public SinhVien() {}

	
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		if(maSV > 0) {
			this.maSV = maSV;
		}else {
			System.out.println("Loi 1");
		}
		if(hoTen.length() >0) {
			this.hoTen = hoTen;
		}else {
			System.out.println("Loi 2");
		}
		if(diemLT >0 && diemLT <10) {
			this.diemLT = diemLT;
		}else {
			System.out.println("Loi 3");
		}
		if(diemTH > 0 && diemTH <10) {
			this.diemTH = diemTH;
		}else {
			System.out.println("Loi 4");
		}
	}


	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if(maSV > 0) {
			this.maSV = maSV;
		}else {
			System.out.println("Loi 1");
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if(hoTen.length() >0) {
			this.hoTen = hoTen;
		}else {
			System.out.println("Loi 2");
		}
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(double diemLT) {
		if(diemLT >0 && diemLT <10) {
			this.diemLT = diemLT;
		}else {
			System.out.println("Loi 3");
		}
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) {
		if(diemTH > 0 && diemTH <10) {
			this.diemTH = diemTH;
		}else {
			System.out.println("Loi 4");
		}
	}

	public double diemTB() {
		return (this.diemLT + this.diemTH)/2;
	}

	@Override
	public String toString() {
		String s = String.format("%8d %15s %7.1f %7.1f %7.1f", maSV, hoTen, diemLT, diemTH, diemTB());
		
		return s;
		
	}
	
	
	
}
