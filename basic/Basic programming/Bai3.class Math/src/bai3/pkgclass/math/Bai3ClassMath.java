/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3.pkgclass.math;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3ClassMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        double a , b ; 
        Scanner sc = new Scanner(System.in); 
        System.err.println("nhap vao so a =");
        a = sc.nextDouble(); 
        System.out.println("nhap vao so b =");
        b = sc.nextDouble(); 
        
        // ham tri tuyet doi 
        System.out.println("|a| = " + Math.abs(a));
        
        // ham tim min 
        System.err.println("Min(a,b) =" + Math.min(a, b));
        
        // ham tim max
        System.err.println("Max(a,b) =" + Math.max(a, b));
        
        // ham ceil 
        System.err.println("ceil(a,b) = " + Math.ceil(a));
        
        // ham floor 
        System.out.println("floor(a) =" + Math.floor(a));
        
        // ham can bac hai 
        System.err.println("sqrt(a) =" + Math.sqrt(a));
        
        //ham tinh a mu b 
        System.err.println("pow(a,b) = " + Math.pow(a,b)); 
    }
}
