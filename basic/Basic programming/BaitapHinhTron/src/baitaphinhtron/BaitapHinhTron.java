/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaphinhtron;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaitapHinhTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r , dientich , chuvi;
        Scanner input = new Scanner(System.in); 
        System.out.println("nhap ban kinh hinh tron r = ");
        r = input.nextDouble(); 
        chuvi = 2*Math.PI*r; 
        System.out.println("chu vi hinh tron = " + chuvi );
        System.out.println("chu vi hinh tron = " + Math.round(chuvi));// ham lam tron 
        System.out.println("chu vi hinh tron = " + Math.round(chuvi * 100.0)/100.0);//meo lay hai chu so sau du phay 

        
        dientich = Math.PI * Math.pow(r, 2); 
        System.out.println("dien tich hinh tron = " + dientich);
        System.out.println("dien tich hinh tron = " + Math.round(dientich));//ham lam tron
        System.out.println("dien tich hinh tron = " + Math.round(dientich * 100.0)/100.0);// meo lay hai chu so sau dau phay 

    }
    
}
