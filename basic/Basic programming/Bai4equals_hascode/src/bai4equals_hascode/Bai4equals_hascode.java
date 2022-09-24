/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai4equals_hascode;

/**
 *
 * @author Admin
 */
public class Bai4equals_hascode {

    /**
     * @param args the command line arguments
     */
    private int day;
    private int month;
    private int year;

    public Bai4equals_hascode(int day, int month, int year) {
        if(day > 1 && day <= 31){
            this.day = day ; 
        }else {
            this.day = 1; 
        }
        if(month > 1 && month <= 12){
            this.month = month;
        }else{
            this.month = 1; 
        }
        if(year > 1){
            this.year = year ; 
        }else{
            this.year = 1; 
        }
    }

public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if(day >= 1 && day <=31)
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12)
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year > 1)
        this.year = year;
    }    

    @Override//
    public String toString() {
        return this.day + "/" + this.month +"/"+this.year; 
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.day;
        hash = 73 * hash + this.month;
        hash = 73 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {// doi tuong truyen vao bang doi tuong minh dang dung
            return true;
        }
        if (obj == null) {// doi tuong truyen vao == null 
            return false;
        }
        if (this.getClass() != obj.getClass()) {// this.getClass dc tao ra tu doi tuong la my date , obj.getClass dc tao ra tu doi tuong minh truyen vao de ss 
            return false;
        }
        final Bai4equals_hascode other = (Bai4equals_hascode) obj;
        return true;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Bai4equals_hascode md1 = new Bai4equals_hascode(15, 5, 2025);
	Bai4equals_hascode md2 = new Bai4equals_hascode(11, 1, 2021);
	Bai4equals_hascode md3 = new Bai4equals_hascode(15, 5, 2025);
        System.out.println(md1); // 15/5/2021
	System.out.println(md2);
	System.out.println(md3);
           // equals 
//    int a = 5 ; 
//    int b = 6 ; 
//    if(a == b){
//            System.err.println("a = b");
//      }else{
//        System.err.println(" a != b");
//      }
    }
}
