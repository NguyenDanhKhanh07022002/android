/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phuongtrinhbac2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Phuongtrinhbac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // phuong trinh bac hai co dang aX^2 +bX + c = 0 
        // cac bien can co a , b , c , x1 , x2 , delta 
        /*
        b1 : tinh delta = b^2 - 4ac
        b2 : kiem tra delta 
        2.1 : delta < 0 => phuong trinh vo nghiem 
        2.2 : delta = 0 => phuong trinh co nghiem kep x1 = x 2 = -b/2a
        2.3 : delta > 0 => phuong trinh co hai nghiem 
        x1 = (-b -sqrt(delta)/(2*a))
        x2 = (-b +sqrt(delta)/(2*a))
        */
        
        double a, b , c = 0, x , x1 , x2 , delta; 
        Scanner sc = new Scanner(System.in); 
        System.err.println("nhap a =");
        a = sc.nextDouble(); 
        System.err.println("nhap b =");
        b = sc.nextDouble(); 
        System.err.println("nhap c =");
        c = sc.nextDouble(); 
        
        if(a == 0 ){
            System.err.println("phuong trinh tro thanh phuong trinh bac nhat ");
            if(b == 0)
            {
                if(c == 0){
                    System.err.println("phuong trinh co vo so nghiem");
                }else{
                    System.err.println("phuong trinh vo nghiem");
                }
            }else{
                x = -b/a; 
                System.err.println("x = " + x);
            }
        }else{
            delta = Math.pow(b, 2) - 4*a*c; 
            if(delta < 0){
                System.err.println("phuong trinh vo nghiem");
            }else if(delta == 0){
                x1 = x2 = -b/2*a;
                System.err.println("phuong trinh co nghiem kep : x1 = x2 = " + x1);
            }else {
                x1 = ((-b + Math.sqrt(delta))/(2 *a)); 
                x2 = ((-b - Math.sqrt(delta))/(2 *a));
                System.err.println("x1 = " + x1);
                System.err.println("x2 = " + x2);
                System.err.println("x1 = " + Math.round(x1));// lam tron 

            }
        }
    }
}
