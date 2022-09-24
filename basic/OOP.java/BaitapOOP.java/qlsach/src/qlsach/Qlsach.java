/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsach;

/**
 *
 * @author Admin
 */
public class Qlsach {

    
    public static void main(String[] args) {
       date ngay1 = new date(12,11,2001); 
       date ngay2 = new date(30,11,2002); 
       date ngay3 = new date(15,11,2002); 
       
       
       tacgia tacgia1 = new tacgia("nguyen danh khanh",ngay1);
       tacgia tacgia2 = new tacgia("nguyen thi kim chi",ngay3);
       tacgia tacgia3 = new tacgia("nguyen thi kim chi",ngay3);
       
       
       sach sach1 = new sach("lap trinh c", 200, 2012,tacgia1); 
       sach sach2 = new sach("lap trinh c++", 100, 2022,tacgia3); 
       sach sach3 = new sach("lap trinh java", 300, 2022,tacgia2); 

       sach1.intensach(); 
       sach2.intensach();
       sach3.intensach();
       
        System.out.println("so sanh nam san xuat");
        
        System.out.println("so sanh sach 1 va sach 3 : "+ sach1.kiemtra(sach2));
        
        System.out.println("gia ban sau khi giam : " + sach1.giasaukhigiam(10));
    }
    
}
