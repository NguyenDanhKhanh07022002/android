/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlphim;

/**
 *
 * @author Admin
 */
public class Qlphim {

    private String tenphim; 
    private int namsanxuat ; 
    private hangsx hangsx ; 
    private double giave ; 
    private date ngaychieu ; 

    public Qlphim(String tenphim, int namsanxuat, hangsx hangsx, double giave, date ngaychieu) {
        this.tenphim = tenphim;
        this.namsanxuat = namsanxuat;
        this.hangsx = hangsx;
        this.giave = giave;
        this.ngaychieu = ngaychieu;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public hangsx getHangsx() {
        return hangsx;
    }

    public void setHangsx(hangsx hangsx) {
        this.hangsx = hangsx;
    }

    public double getGiave() {
        return giave;
    }

    public void setGiave(double giave) {
        this.giave = giave;
    }

    public date getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(date ngaychieu) {
        this.ngaychieu = ngaychieu;
    }
    public boolean kiemtragiarehon(Qlphim phimkhac){
        return this.giave < phimkhac.giave ; 
    }
    public String tennhasanxuatphim(){
        return this.hangsx.getTenhangsx(); 
    }
    public double giavesaukhikhuyenmai(double x){
        return this.giave*(1 - x/100); 
    }
    public static void main(String[] args) {
        date ngay1 = new date(12,12,12);
        date ngay2 = new date(11,12,12);
        date ngay3 = new date(13,12,12);
        date ngay4 = new date(14,12,12);
        
        hangsx hang1 = new hangsx("samsung", "nhat ban"); 
        hangsx hang2 = new hangsx("fpt", "viet nam"); 
        hangsx hang3 = new hangsx("samsung", "nhat ban"); 
        hangsx hang4 = new hangsx("samsung", "nhat ban"); 
        
        Qlphim phim1 = new Qlphim("bang gia",2002,hang1,200,ngay2);
        Qlphim phim2 = new Qlphim("bang gia",2002,hang3,700,ngay2);
        Qlphim phim3 = new Qlphim("bang gia",2002,hang1,600,ngay2);
        Qlphim phim4 = new Qlphim("bang gia",2002,hang1,500,ngay2);
        
        System.out.println("gia ve bo phim 1 re hon bo phim 2 " + phim1.kiemtragiarehon(phim2));
        System.out.println("hang san xuat : " + phim2.tennhasanxuatphim());
        
        System.out.println("gia ve sau khi khuyen mai : " + phim1.giavesaukhikhuyenmai(10));
    }
    
}
