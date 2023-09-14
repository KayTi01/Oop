package tuan1_HInhChuNhat;

public class TestHCN {
	public static void main(String[] args) {
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(5);
		h1.setChieuRong(9);
		System.out.println(h1);
			
		HinhChuNhat h2 = new HinhChuNhat(8, 5);
		System.out.println(h2);
	}
}
