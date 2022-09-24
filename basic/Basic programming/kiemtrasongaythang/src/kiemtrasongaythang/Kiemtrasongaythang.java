/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiemtrasongaythang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Kiemtrasongaythang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int thang , nam ; 
        Scanner sc = new Scanner(System.in); 
        System.err.println("nhap vao thang :");
        thang = sc.nextInt(); 
        System.err.println("nhap vao nam :");
        nam = sc.nextInt(); 
        switch (thang) {
            case 1:
            case 3: 
            case 5:
            case 7:
            case 8:
            case 10: 
            case 12:
                System.err.println("co 31 ngay");
                break; 
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                System.err.println("co 30 ngay");
                break; 
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0)|| (nam % 400 ==0)){
                    System.err.println("co 29 ngay");
                }else{
                    System.err.println("co 28 ngay");
                }
                break; 
            default:
                System.out.println("nhap sai du lieu"); 
                break; 
        }
    }
    
}
