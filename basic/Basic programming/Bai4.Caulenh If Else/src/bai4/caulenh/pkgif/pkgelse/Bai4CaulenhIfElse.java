/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4.caulenh.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4CaulenhIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("nhap so nguyen n =");
        n = sc.nextInt(); 
        
        if(n % 2 == 0){
            System.out.println(n + "la so chan ");
        }
        else {
            System.out.println(n + "la so le ");
        }
    }
    
}
