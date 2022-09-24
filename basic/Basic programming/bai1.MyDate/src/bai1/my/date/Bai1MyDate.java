/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1.my.date;

/**
 *
 * @author Admin
 */
public class Bai1MyDate {

    /**
     * @param args the command line arguments
     */
    private int day ; 
    private int month ; 
    private int year ; 
       
    
    // constructor 
        public Bai1MyDate(int d , int m , int y){
            this.day = d; 
            this.month = m ; 
            this.year = y ;  
    }
    public void printday(){
        System.err.println("day "+ this.day);
    }
    public void printmonth(){
         System.err.println("month" + this.month);
    }
    public void printyear(){
        System.err.println("year " + this.year);
    }
    public void printdate(){
        System.err.println("day" + day + "month " + month + "year" + year);
    }
    public static void main(String[] args) {
        // TODO code application logic here 
        Bai1MyDate md = new Bai1MyDate(24,5,2019);
        md.printdate();
        md.printday();
        md.printmonth();
        md.printyear();
    }
}
