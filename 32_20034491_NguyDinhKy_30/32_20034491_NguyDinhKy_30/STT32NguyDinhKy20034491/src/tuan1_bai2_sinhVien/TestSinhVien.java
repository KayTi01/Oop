package tuan1_bai2_sinhVien;

import java.util.Scanner;

public class TestSinhVien {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(20034491, "NguyDinhky", 8, 9.0);
		
		SinhVien sv2 = new SinhVien(20012222, "NguyenVanA", 8, 6);
		
		SinhVien sv3 = new SinhVien();
		
		System.out.println("Nhap ma so cua sinh vien 3");
		Scanner sc1 = new Scanner(System.in);
		int maSV = sc1.nextInt();
		
		System.out.println("Ho ten cua sinh vien 3");
		Scanner sc2 = new Scanner(System.in);
		String hoTen = sc2.nextLine();
		
		System.out.println("Nhap diem ly thuyet cua sinh vien 3");
		Scanner sc3 = new Scanner(System.in);
		double diemLT = sc3.nextDouble();
		
		System.out.println("Nhap diem thuc hanh cua sinh vien 3");
		Scanner sc4 = new Scanner(System.in);
		double diemTH = sc4.nextDouble();
		
		
		sv3 = new SinhVien(maSV, hoTen, diemLT, diemTH);
		System.out.println("masv        hoten          diemLT   diemTH   diemTB  ");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
}
