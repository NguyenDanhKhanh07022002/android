/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4.caulenh.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        // phuong trinh bac nhat aX + b = 0 ;
        
        double a,b,x ; 
        Scanner sc = new Scanner(System.in); 
        System.err.println("nhap a = ");
        a = sc.nextDouble(); 
        System.err.println("nhap b =");
        b = sc.nextDouble(); 
        
        if(a == 0)
        {
            if(b == 0){
                System.err.println("phuong trinh vo so nghiem ");
            }else {
                System.err.println("phuong trinh vo nghiem");
            }
        }else{
            x = -b/a ; 
            System.err.println("x = " + x);
        }
    }
}
