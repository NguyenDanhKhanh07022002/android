
public class vidu {
	public static void main(String[] args) {
		String s1 = "xin chao co chu , xin chao cac ban , xin chao!"; 
		String s2 = "xin chao"; 
		String s3 = "xin chao 123"; 
		char c1 = 'o'; 
		
		// Hàm indexOf : tìm kiếm 
		System.out.println("vi tri cua s2 trong s1 la : "+ s1.indexOf(s2));
		/*
		 * trong cái chuỗi s1 có chứa chuỗi s2 hay không nếu chứa thì nó sẽ 
		 * nằm ở vị trí nào trong chuỗi s1
		 */
		System.out.println("vi tri cua s3 trong s1 la : "+ s1.indexOf(s3));
		
		// sử dụng vị trí bắt đầu 
		System.out.println("vi tri của s2 trong s1 la : " + s1.indexOf(s2 ,2));
		
		// hàm indexOf nó có thể tìm kiếm kí tự 
		//tìm kiếm char 
		System.out.println("vi tri cua c1 trong s1 la :" + s1.indexOf(c1));
		// vị trí bắt đàu từ 
		System.out.println("vị trí cua c1 trong s1 la : " + s1.indexOf(c1,20));
		
		// Hàm lastIndexof => tìm kiếm từ phải sang trái
		System.out.println("vi tri cua s2 trong s1 (tu phai sang trai ) laz`: "+ s1.lastIndexOf(s2));
				
		// tenFile = "Bai tap.excel.lop12.xls';
	}
}