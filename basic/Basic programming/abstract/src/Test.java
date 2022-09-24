
public class Test {
public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hon Da", "Han Quoc"); 
		HangSanXuat h2 = new HangSanXuat("Hon Da", "Han Quoc"); 
		HangSanXuat h3 = new HangSanXuat("Hon Da", "Han Quoc"); 
		
		PhuongTienDiChuyen p1 = new XeOTo(h3, "Xang"); 
		PhuongTienDiChuyen p2 = new XeDap(h3);
		PhuongTienDiChuyen p3 = new MayBay(h3, "Hat Nhan"); 
		
		System.out.println("lay ra hang san xuat : ");
		System.out.println("P1\t" + h1.getTenHangSX());
	}
}
