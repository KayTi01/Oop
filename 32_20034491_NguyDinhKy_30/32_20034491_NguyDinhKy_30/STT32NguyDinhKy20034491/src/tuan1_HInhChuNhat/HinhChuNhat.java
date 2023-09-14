package tuan1_HInhChuNhat;

public class HinhChuNhat {
	private double chieuDai, chieuRong;
	
	public HinhChuNhat() {}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		if(chieuDai > 0) {
			this.chieuDai = chieuDai;
		}else {
			System.out.println("Loi 1");
		}
		if(chieuRong > 0) {
			this.chieuRong = chieuRong;
		}else {
			System.out.println("Loi 2 ");
		}
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		if(chieuDai > 0) {
			this.chieuDai = chieuDai;
		}else {
			System.out.println("Loi 1");
		}
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		if(chieuRong > 0) {
			this.chieuRong = chieuRong;
		}else {
			System.out.println("Loi 2 ");
		}
	}
	
	public double chuVi() {
		return (this.chieuDai + this.chieuRong)*2;
	}
	
	public double dienTich() {
		return this.chieuDai*this.chieuRong;
	}

	@Override
	public String toString() {
		return " [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", chuVi=" + chuVi()+ ", dienTich" + dienTich() +"]";
	}
	
	
	
	
	
	
}
