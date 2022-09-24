/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        System.err.println("Nhap a = ");
        int a = sc.nextInt(); 
        
        String KQ = (a%2 == 0)?"so chan":"so le"; 
        System.err.println("kq =" + KQ);
    }
    
}
