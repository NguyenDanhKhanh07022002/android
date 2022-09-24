/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2.pthucclassjava;

/**
 *
 * @author Admin
 */
public class Bai2Pthucclassjava {

    /**
     * @param args the command line arguments
     */
    private String tenLoaiCaPhe ;
    private double giaTien1Kg ; 
    private double khoiLuong; 
    
    // constructor
    public Bai2Pthucclassjava(String Ten , double giatien , double khoiluong){
        this.tenLoaiCaPhe = Ten; 
        this.giaTien1Kg = giatien ; 
        this.khoiLuong = khoiluong ; 
    } 
    public double tinhTongTien (){
        return this.khoiLuong * this.giaTien1Kg; 
    }
     
    public boolean kiemTraLonHon(double kl){
//        if(this.khoiLuong  > khoiLuong){
//            return true; 
//        }else{
//            return false; 
//        }
        return this.khoiLuong > kl ; // cung tra ve true or flase 
    }
    public boolean kiemTraTongTienLonHon500(){
        return this.tinhTongTien() > 500; 
    }
    
    // giam gai x %
    public double giamGia(double x){
        if(this.tinhTongTien() > 500){
            return this.tinhTongTien() * (x/100); 
        }else {
            return 0; 
        }
    }
    public double giaSauKhiGiam(){
        return this.tinhTongTien() - this.giamGia(200); 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Bai2Pthucclassjava hd = new Bai2Pthucclassjava("trung nguyen", 500 ,200);
        System.err.println("Tong Tien : " + hd.tinhTongTien());
        System.err.println("kiem tra khoi luong > 300kg :" + hd.kiemTraLonHon(300));
        System.err.println("kiem tra khoi luong > 2 :" + hd.kiemTraLonHon(2));
        System.err.println("kiem tra tong tien lon hon 500 :" + hd.kiemTraTongTienLonHon500());
        System.err.println("so tien sau khi duoc giam gia : " + hd.giamGia(200));
    }
}
