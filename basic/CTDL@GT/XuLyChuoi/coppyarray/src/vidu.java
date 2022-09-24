import java.util.Arrays;

public class vidu {
	public static void main(String[] args) {
		
		// Kiểu nguyên thủy
				int[] mang1 = { 1, 2, 3 };

				// Copy mảng cách 1 
				int[] mang1_a = mang1;
				mang1_a[0] = 100; // đều bị thay đổi ở cả hai mảng 

				System.out.println("mang 1: " + Arrays.toString(mang1));
				System.out.println("mang 1_a: " + Arrays.toString(mang1_a));
				
				// coppy mảng cách 2 clone 
				int[] mang1_b = mang1.clone();
				mang1_b[0] = 50;// nó không làm thay đổi giá trị của mảng ban đầu 
				System.out.println("mang 1_b :" + Arrays.toString(mang1_b));
				
				// coppy mảng cách 3 - dùng hàm system.arraaycoppy
				int[] mang1_c = new int[mang1.length];
				System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
				mang1_c[0] = 90;
				System.out.println("Mảng 1_c: " + Arrays.toString(mang1_c));
	}
}