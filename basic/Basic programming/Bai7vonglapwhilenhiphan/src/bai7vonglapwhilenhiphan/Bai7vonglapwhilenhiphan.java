/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7vonglapwhilenhiphan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai7vonglapwhilenhiphan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ; 
        Scanner sc = new Scanner(System.in); 
        System.err.println("nhap gia tri n = ");
        n = sc.nextInt(); 
        
        
        String nhiphan = ""; 
        while(n > 0){
            nhiphan = (n%2)+ nhiphan; 
            n = n/2; 
        }
        
        System.err.println("binary is : " + nhiphan);
    }
    
}
