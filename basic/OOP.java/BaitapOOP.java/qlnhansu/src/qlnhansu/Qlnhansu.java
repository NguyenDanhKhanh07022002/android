/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlnhansu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Qlnhansu {

    String fullname ; 
    double salary ; 
    
    public void intput(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("full name : ");
        fullname = sc.nextLine(); 
        System.out.println("salary :");
        salary = sc.nextDouble(); 
    }
    public void output(){
        System.out.println("\nFull Name : " + fullname + "\nSalary : " + salary );
    }
    
    public Qlnhansu(){
        this.fullname =""; 
        this.salary = 0 ; 
    }

    public Qlnhansu(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("nhap n : ");
        n = sc.nextInt(); 
        Qlnhansu nhansu[] = new Qlnhansu[n]; // khoi tao bo nho cho nhan su 
        for(int i = 0 ; i < n ; i++){
            nhansu[i] = new Qlnhansu(); // khoi tao du lieu cho nhan su 
        }
        System.out.println("nhap danh sach nhan su : ");
        for(int i = 0 ; i < n ; i++){
            nhansu[i].intput();
        }
    }
}
