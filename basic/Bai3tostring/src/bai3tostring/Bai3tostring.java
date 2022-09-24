/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3tostring;

/**
 *
 * @author Admin
 */
public class Bai3tostring {

    /**
     * @param args the command line arguments
     */
    private int day;
    private int month;
    private int year;

    public Bai3tostring(int day, int month, int year) {
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

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bai3tostring md1 = new Bai3tostring(15, 5, 2025);
	Bai3tostring md2 = new Bai3tostring(11, 1, 2021);
	Bai3tostring md3 = new Bai3tostring(30, 3, 2030);
        System.out.println(md1); // 15/5/2021
	System.out.println(md2);
	System.out.println(md3);
    }

}
