package view;

import javax.swing.JFrame;

public class bai1 {
public static void main(String[] args) {
		JFrame jf = new JFrame(); 
		//gán tên 
		jf.setTitle("Examp JFrame");
		// gán kích cỡ
		jf.setSize(600,400); 
		
		
		
//		while(true) {
//			System.out.println("chuong trinh dang chay");
//		}
		
		//gắn vị trí hiển thị (trên, dưới .. của màn hình chính) 
		jf.setLocation(300,300);
		// thoat ra khỏi chương trình khi đóng cửa sổ JFrame (đóng cửa sổ thì chương trình sẽ dừng lại)
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// hiển thị màn hình
				jf.setVisible(true);
	}
}
