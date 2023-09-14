package tuan1_Bai1_ToaDo;

public class ToaDo {
	private String ten;
	private double x, y;
	
	public ToaDo() {}
	
	

	public ToaDo(String ten, double x, double y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}



	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		String s = String.format("%s(%4.2f,%4.2f)", ten, x, y );
		return s;
	}
	
}
