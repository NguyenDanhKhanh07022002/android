
public class vidu {
		public static void main(String[] args) {
			String s1 = "nguyen danh khanh"; 
			String s2 = "nguyen danh khanh"; 
			String s3 = "nguyen danh Khanh";
			
			//ham equals => so sánh 2 chuỗi giống nhau , có phân biệt chữ hoa chữ thường
			//ham trả về true ỏ false
			System.out.println("s1 equals s2" + ":"+ s1.equals(s2));
			System.out.println("s1 equals s3" + ":"+ s1.equals(s3));
			// Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
			System.out.println("s1 equalsIgnoreCase s2" + " : " + s1.equalsIgnoreCase(s2));
			System.out.println("s1 equalsIgnoreCase s3" + " : " + s1.equalsIgnoreCase(s3));
			// Nếu các bạn só sánh tài khoản và mật khẩu của người khi đăng nhâp
			// Bạn sẽ dùng equals hoặc euqalsIgnoreCase?
			// sẽ so sánh bằng equalsIgnoreCase 
			
			// Hàm compareTo => so sánh > < = (so sánh trong bảng mã aski) 
			String sv3 = "Nguyễn Văn";
			String sv1 = "Nguyễn Văn A";
			String sv2 = "Nguyễn Văn B";
			String sv4 = "Nguyễn Văn a";
			
			System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2));
			System.out.println("sv1 compareTo sv3: "+ sv1.compareTo(sv3));
			System.out.println("sv1 compareTo sv4: "+ sv1.compareTo(sv4));
			
			// Hàm compareToIgnoreCase => Tường tự hàm compareTo, không biệt chữ hoa chữ thường
			
			// Hàm regionMatches => so sánh một đoạn
			
			String r1 = "TITV.vn"; 
			String r2 = "TV.vn"; 
			
			boolean check = r1.regionMatches(2, r2, 0, 4); 
			// 2 là bắt đầu kí tự thứ 2 của r1 
			// 0 là bắt đầu kí tự thứ 0 của r2 
			// 4 là so sanh 4 kí tự 
			System.out.println(check);
			

			// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
			String sdt = "037456789";
			System.out.println(sdt.startsWith("037"));
			System.out.println(sdt.startsWith("034"));
			
			// Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
			String tenFile = "I love you.JPG";
			String tenFile2 = "Hoc Java.PDF";
			
			if (tenFile.endsWith(".JPG")) {
				System.out.println("File 1 là hình ảnh!");
			}else if (tenFile.endsWith(".PDF")) {
				System.out.println("File 1 là file PDF!");
			}
			
			if (tenFile2.endsWith(".JPG")) {
				System.out.println("File 2 là hình ảnh!");
			}else if (tenFile2.endsWith(".PDF")) {
				System.out.println("File 2 là file PDF!");
		}		
	}
}
