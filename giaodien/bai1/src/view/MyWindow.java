package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	
	// contructer
	public MyWindow() {
		
	}
	// cách 1
	public void showIt() {
		this.setVisible(true);
	}
	
	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	// cách 2
	public void showIt(String title , int with , int height) {
		this.setTitle(title);
		this.setSize(with, height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow(); 
		m1.showIt();
	}
}
