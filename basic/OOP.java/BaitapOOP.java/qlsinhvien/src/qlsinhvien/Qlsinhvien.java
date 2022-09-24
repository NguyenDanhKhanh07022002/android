/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsinhvien;

/**
 *
 * @author Admin
 */
public class Qlsinhvien {

    private String masinhvien , hovaten ; 
    ngay ngaysinh ; 
    double diemtb ; 
    lop lop ; 

    public Qlsinhvien(String masinhvien, String hovaten, ngay ngaysinh, double diemtb, lop lop) {
        this.masinhvien = masinhvien;
        this.hovaten = hovaten;
        this.ngaysinh = ngaysinh;
        this.diemtb = diemtb;
        this.lop = lop;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public ngay getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(ngay ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public lop getLop() {
        return lop;
    }

    public void setLop(lop lop) {
        this.lop = lop;
    }
    public String tenkhoamasinhviendangtheohoc(){
        return this.lop.getTenkhoa(); 
    }
    public boolean kiemtraketqua(){
        return this.diemtb > 5 ;
    }
    public boolean kiemtrangaysinhgiongnhau(Qlsinhvien sinhvien){
        return this.ngaysinh.equals(sinhvien.ngaysinh); 
    }
    public static void main(String[] args) {
        ngay ngay1 = new ngay(12,12,12); 
        ngay ngay2 = new ngay(12,12,12); 
        ngay ngay3 = new ngay(12,12,12); 
        ngay ngay4 = new ngay(12,12,12); 

        lop lop1 = new lop("cntt","cntt"); 
        lop lop2 = new lop("cntt","cntt"); 
        lop lop3 = new lop("cntt","cntt"); 
        lop lop4 = new lop("cntt","cntt"); 
        
        
        Qlsinhvien sinhvien1 = new Qlsinhvien("sv1","nguyendanhkhanh",ngay1,9,lop2); 
        Qlsinhvien sinhvien2 = new Qlsinhvien("sv1","nguyendanhkhanh",ngay1,3,lop2); 
        Qlsinhvien sinhvien3 = new Qlsinhvien("sv1","nguyendanhkhanh",ngay1,9,lop2); 
        Qlsinhvien sinhvien4 = new Qlsinhvien("sv1","nguyendanhkhanh",ngay1,9,lop2); 

        
        System.out.println("ten khoa ma sinh vien dang theo hoc la :" + sinhvien1.tenkhoamasinhviendangtheohoc());
        System.out.println("kiem tra ket qua sinh vien : " + sinhvien2.kiemtraketqua());
        System.out.println("ngay sinh sinh vien 1 giong ngay sinh sinh vien 2 : " + sinhvien1.kiemtrangaysinhgiongnhau(sinhvien2));
    }
}
