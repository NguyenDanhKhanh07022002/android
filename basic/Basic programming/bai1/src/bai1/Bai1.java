/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// F kieu 
package bai1;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 100; 
        int b = 2; 
        
        System.err.println("a = " + a);
        System.err.println("b = " + b);
        // ep kieu ngam dinh
        float c = (float)a ; 
        float d = (float)b ; 
        
        System.err.println("d =" + d);
        System.err.println("c = "+ c );
        
        // f kieu tuong minh 
        float e = (float) 3.5; 
        float f = (float) 9.5;
        
        int k = (int)e;
        int h = (int)f; 
        
        System.err.println("k =" + k);
        System.err.println("h =" + h);
        
        //ep kieu giua bien nguyen thuy va doi tuong 
        int x = new Integer(32); 
        System.err.println("x =" + x);
    }
    
}
