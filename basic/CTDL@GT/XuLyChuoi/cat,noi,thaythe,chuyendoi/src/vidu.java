
public class vidu {
	public static void main(String[] args) {
		String s1 = "TiVi"; 
		String s2 = ".vn"; 
		
		// có thể nối chuỗi 
		String s3 = s1 + s2 ; 
		//hàm nối chuỗi (concat())
		String s4 = s1.concat(s2); // dùng hàm nối chuỗi sẽ không làm thày đổi s1 và s2
		System.out.println(s3);
		System.out.println(s4);
		
		// hàm replaceAll => thay the 
		String s5 = "Tung.tv"; 
		String s6 = s5.replaceAll("Tung","TiVi"); 
		System.out.println(s6);
		
		// hàm toLowerCase : chuyển về viết thường 
		// ham toUpperCase : chuyển về viết hoa 
		String s7 = s3.toLowerCase(); 
		String s8 = s3.toUpperCase(); 
		System.out.println(s7);
		System.out.println(s8);
		
		// trim() : xóa khoảng trắng du thừa ở dầu chuỗi 
		String s9 = "    nguyen danh khanh      "; 
		System.out.println(s9.trim());
		
		//subString : cắt chuỗi con 
		String s10 = "Xin chao cac ban , minh la TiVi.vn"; 
		String s11 = s10.substring(10); // 10 : bắt đầu từ vị trí thứ 10 trong chuỗi 
		String s12 = s10.substring(10,15); // bắt đầu vị trí thứ 10 kết thúc vị trí thứ 15
		System.out.println(s11);
		System.out.println(s12);
	}
}
