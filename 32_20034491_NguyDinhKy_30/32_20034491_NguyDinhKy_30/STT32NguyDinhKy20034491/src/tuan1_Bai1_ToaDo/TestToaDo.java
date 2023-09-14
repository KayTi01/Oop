package tuan1_Bai1_ToaDo;

public class TestToaDo {
	public static void main(String[] args) {
		ToaDo t1 = new ToaDo("a", 7.5, 6);
		
		ToaDo t2 = new ToaDo();
		t2.setTen("b");
		t2.setX(8);
		t2.setY(5);
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
