/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maymath;

/**
 *
 * @author Admin
 */
public class Maymath {

    public int timmin(int a , int b){
        if(a < b)
        {
            return a ;
        }else{
            return b ; 
        }
    }
    // nap chong toan tu 
    // ten timmin thi giong nhau con kieu du lieu phai khac nhau 
    public double timmin(double a , double b){
        if(a < b)
        {
            return a ;
        }else{
            return b ; 
        }
    }
    
    public double tinhtong(double a , double b){
        return a + b ; 
    }
    
    public double tinhtong(double[] arr){
        int tong = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            tong += arr[i]; 
        }
           return tong ; 
    }
    public static void main(String[] args) {
        Maymath mm = new Maymath(); 
        System.out.println("--------test----------");
        System.out.println("min cua hai so la  : " + mm.timmin(5, 6));
        System.out.println("min cua hai so la :" + mm.timmin(5.6, 6));
        double arr[] = new double[] {1,2,3,4,5};
		System.out.println("tinhTong(arr)= "+mm.tinhtong(arr));
    }
    
}
