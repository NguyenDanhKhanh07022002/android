/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5.pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ; 
        Scanner sc = new Scanner(System.in); 
        System.err.println("nhap so tu 0 den 8 :");
        n = sc.nextInt(); 
        
        switch (n) {
            case 2 :
                System.err.println("thu 2 ");
                break;
            case 3 :
                System.err.println("thu 3 ");
                break;
            case 4 :
                System.err.println("thu 4 ");
                break;
            case 5 :
                System.err.println("thu 5 ");
                break;
            case 6 :
                System.err.println("thu 6 ");
                break;
            case 7 :
                System.err.println("thu 7 ");
                break;
            case 8 :
                System.err.println("chu nhat");
                break;
            default:
                System.err.println("nhap so khong hop le !!!");
        }
    }
    
}
