/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package get.set;

/**
 *
 * @author Admin
 */
public class GetSet {

    /**
     * @param args the command line arguments
     */
    private int day ; 
    private int month ; 
    private int year ; 
    
    // constructor
    
    public GetSet(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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
        if(day > 1 && day <=31)
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if(month > 1 && month <= 12)
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year > 1)
        this.year = year;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        GetSet md = new GetSet(31,2,2021); 
        System.err.println("Day : " + md.getDay());
        md.setDay(35);
        System.err.println("Day : " + md.getDay());
        System.out.println("Month = "+ md.getMonth());
	md.setMonth(11);
	System.out.println("Month = "+ md.getMonth());
	md.setMonth(5);
        System.out.println("Month = "+ md.getMonth());
    }
    
}
