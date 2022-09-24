/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsach;

/**
 *
 * @author Admin
 */
public class sach {
    String tensach; 
    double giaban ; 
    int namsanxuat ; 
    tacgia tacgia ; 

    public sach(String tensach, double giaban, int namsanxuat, tacgia tacgia) {
        this.tensach = tensach;
        this.giaban = giaban;
        this.namsanxuat = namsanxuat;
        this.tacgia = tacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public tacgia getTacgia() {
        return tacgia;
    }

    public void setTacgia(tacgia tacgia) {
        this.tacgia = tacgia;
    }
    
    public void intensach(){
        System.out.println("ten sach : " + this.tensach);
    }
    public boolean kiemtra(sach sachkhac){
        return this.namsanxuat == sachkhac.namsanxuat;
    }
    public double giasaukhigiam(double x){
        return this.giaban * (1-x/100); 
    }
}
